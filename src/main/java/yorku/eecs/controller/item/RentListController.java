package yorku.eecs.controller.item;

import yorku.eecs.controller.ControllerError;
import yorku.eecs.logic.CSVError;
import yorku.eecs.logic.CsvUtil;
import yorku.eecs.model.item.Item;
import yorku.eecs.model.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RentListController {
    private String path = "src/main/resources/data/rentlist.csv";
    /*
    Current plan for CSV:
    Column 1: Item ID
    Column 2: List of user IDs that have rented item
    Column 3: List of expiration dates, mapped to the users by index
     */

    public void checkItemExists(Item item) {
        String itemID = item.getStringID();
        try {
            List<String> records = CsvUtil.getRecordByColumn(path, itemID, 0);
            if (records == null || records.size() == 0) {
                // Append new item ID at the end of the CSV
                FileWriter csvWriter = new FileWriter(path);
                csvWriter.append(itemID);
                csvWriter.close();
            }
        } catch(IOException e) {
            System.out.println("Error checking item exists in rentlist");
        }
    }

    public boolean checkAvailability(Item item) {
        // Loop through users and count how many copies are checked out
        String itemID = item.getStringID();
        boolean available = false;
        try {
            List<String> records = CsvUtil.getRecordByColumn(path, itemID, 0);
            if (records.size() > 21) { // Not sure if the first column (item ID) is included in list
                available = false;
            }
            else {
                available = true;
            }
        } catch(CSVError e) {
            System.out.println("Error checking availability of item");
        }
        return available;
    }

    public void rentItem(User user, Item item) {
        String itemID = item.getStringID();
        String userID = user.getStringId();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextMonthDate = currentDate.plusMonths(1);
        // Format date in terms of "month-day-year"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String nextMonthString = nextMonthDate.format(formatter);
        checkItemExists(item);
        boolean canRent = checkAvailability(item);
        if (canRent == true) {
            try{
                List<String> newRecord = CsvUtil.getRecordByColumn(path, itemID, 0);
                String newEntry = userID + "~" + nextMonthString;
                newRecord.add(newEntry);
                CsvUtil.removeRecordByColumn(path, itemID, 0);
                CsvUtil.writeCsv(Arrays.asList(newRecord), path, true);
            } catch(CSVError e) {
                System.out.println("Error renting item: " + itemID + " for user: " + userID);
            }
        }
    }

    public void returnItem(User user, Item item) {
        String itemID = item.getStringID();
        String userID = user.getStringId();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextMonthDate = currentDate.plusMonths(1);
        // Format date in terms of "month-day-year"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String nextMonthString = nextMonthDate.format(formatter);
        checkItemExists(item);
        try {
            List<String> record = CsvUtil.getRecordByColumn(path, itemID, 0);
            boolean userHasItem = false;
            int indexToBeDeleted = -1;
            for (int i = 0; i < record.size(); i++) {
                String current[] = record.get(i).split("~");
                if (current[0].equals(userID)) {
                    userHasItem = true;
                    indexToBeDeleted = i;
                    break;
                }
            }
            if (userHasItem == true) {
                record.remove(indexToBeDeleted);
                CsvUtil.removeRecordByColumn(path, itemID, 0);
                CsvUtil.writeCsv(Arrays.asList(record), path, true);
            }
            else {
                System.out.println("User: " + userID + " does not have item: " + itemID + " checked out");
            }
        } catch(CSVError e) {
            System.out.println("Error returning item: " + itemID + " for user: " + userID);
        }
    }

    public List<String> getRentList(User user) {
        /*
        Returns a String list where each element will be "itemID~DueDate"
         */
        String userID = user.getStringId();
        List<String> rentList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // Separate the data by the comma
                String[] entries = currentLine.split(",");
                // Start at 1 because the first element is the item ID
                for (int i = 1; i < entries.length; i++) {
                    String[] current = entries[i].split("~");
                    if (current[0].equals(userID)) {
                        // entries[0] is the item ID, current[1] is the due date
                        String addItem = entries[0] + "~" + current[1];
                        rentList.add(addItem);
                    }
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error getting rent list for user: " + userID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rentList;
    }

    public List<String> getUsersDueDates(User user) {
        /*
        Returns the due dates for all the items a user has rented, without the item IDs
         */
        String userID = user.getStringId();
        List<String> dueDates = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // Separate the data by the comma
                String[] entries = currentLine.split(",");
                // Start at 1 because the first element is the item ID
                for (int i = 1; i < entries.length; i++) {
                    String[] current = entries[i].split("~");
                    if (current[0].equals(userID)) {
                        // entries[0] is the item ID, current[1] is the due date
                        dueDates.add(current[1]);
                    }
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error getting due dates for user: " + userID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dueDates;
    }

    public List<String> getUsersItems(User user) {
        /*
        Returns a list containing all the items a user has rented, without the due dates
         */
        String userID = user.getStringId();
        List<String> itemsList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // Separate the data by the comma
                String[] entries = currentLine.split(",");
                // Start at 1 because the first element is the item ID
                for (int i = 1; i < entries.length; i++) {
                    String[] current = entries[i].split("~");
                    if (current[0].equals(userID)) {
                        itemsList.add(entries[0]);
                    }
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error getting items for user: " + userID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return itemsList;
    }

    public List<String> getUsersRentingItem(Item item) {
        /*
        Returns a list containing all the users renting a specified item
         */
        String itemID = item.getStringId();
        List<String> userList = new ArrayList<>();
        try {
            List <String> users = CsvUtil.getRecordByColumn(path, itemID, 0);
            users.remove(0); // Remove the first element since that is the item ID
            userList = users;
        } catch(CSVError e) {
            System.out.println("Error getting the users renting item: " + itemID);
        }
        return userList;
    }

    /*
    Format:
    First column: User ID
    Second column: List of items the user has checked out
    Uses rentlist.csv for data
     */
    //Creating Entry
//    public void createEntry(User user, Item item) throws ControllerError {
//        //Check if user exists
//        user.getRentList().add(item);
//        try{
//            String id = user.getStringId();
//            List<String> records = CsvUtil.getRecordByColumn(path, id, 0);
//            if (records != null) {
//                //Update entry
//                List<String> modifiableRecords = new ArrayList<>();
//                modifiableRecords.add(0, user.getStringId());
//                modifiableRecords.add(1, serializeItemList(user.getRentList()));
//                CsvUtil.writeCsv(Arrays.asList(modifiableRecords), path, false);
//            } else {
//                //Create new entry
//                List<List<String>> newRecord = new ArrayList<>();
//                newRecord.add(Arrays.asList(id, serializeItemList(user.getRentList())));
//                CsvUtil.writeCsv(newRecord, path, true);
//            }
//        }catch (Exception e){
//            throw new ControllerError("Error reading user", e);
//        }
//    }
//
//    private String serializeItemList(ArrayList<Item> rentList) {
//        return rentList.stream()
//                .map(item -> item.getStringID())
//                .collect(Collectors.joining(","));
//    }
//
//    //Reading Entry
//    public void returnEntry(User user, Item returnItem) throws ControllerError {
//        /* User Object rentList before -> {returnItem, other Items}
//        * RentList CSV -> { returnItem, other Items}
//        * return User
//         */
//        List<Item> rentList = user.getRentList();
//        rentList.remove(returnItem);
//        try{
//            String id = user.getStringId();
//            List<String> records = CsvUtil.getRecordByColumn(path, id, 0);
//            if (records != null) {
//                //Update entry
//                List<String> modifiableRecords = new ArrayList<>();
//                modifiableRecords.add(0, user.getStringId());
//                modifiableRecords.add(1, serializeItemList(user.getRentList()));
//                CsvUtil.writeCsv(Arrays.asList(modifiableRecords), path, false);
//            } else {
//                //Throw error that user does not exist
//                throw new ControllerError("User does not exist");
//            }
//        }catch (Exception e){
//            throw new ControllerError("Error reading user", e);
//        }
//    }
//
//    //Return Item
//    public void checkEntry(User user) throws ControllerError {
//        try {
//            String id = user.getStringId();
//            List<String> records = CsvUtil.getRecordByColumn(path, id, 0);
//            System.out.println("Records: " + records);
//            if (records != null && !records.isEmpty()) {
//                // Skip the first element and parse the remaining strings into a list of integers
//                ArrayList<Integer> itemIds = new ArrayList<>();
//                for (int i = 1; i < records.size(); i++) { // Start from 1 to skip the ID
//                    try {
//                        itemIds.add(Integer.parseInt(records.get(i)));
//                    } catch (NumberFormatException e) {
//                        System.err.println("Error parsing record to integer: " + records.get(i));
//                    }
//                }
//                user.getRentList().clear();
//                for (int itemId : itemIds) {
//                    ItemController itemController = new ItemController();
//                    String itemType = itemController.determineItemType(Integer.toString(itemId));
//                    Item item = itemController.readItem(Integer.toString(itemId), itemType);
//                    user.getRentList().add(item);
//                }
//            } else {
//                // Throw error that user does not exist
//                throw new ControllerError("User does not exist");
//            }
//        } catch (Exception e) {
//            throw new ControllerError("Error reading user", e);
//        }
//    }
}
