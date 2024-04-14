package yorku.eecs.testing;
import org.junit.Test;
import yorku.eecs.logic.CSVError;
import yorku.eecs.logic.CsvUtil;
import yorku.eecs.model.item.*;
import java.util.*;
import java.util.List;
import static org.junit.Assert.*;
import yorku.eecs.controller.item.RentListController;
public class RentListControllerTestCases {
    @Test
    public void testSerializeItemListWithEmptyList() {
        ArrayList<Item> rentList = new ArrayList<>();
        assertEquals("", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithOneItem() {
        ArrayList<Item> rentList = new ArrayList<>();
        Book book = new Book(new Book.Builder());
        book.setItemName("item1");
        book.setPublisher("description1");
        book.setPrice(1);
        rentList.add(book);
        assertEquals("item1,description1,1\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithTwoItems() {
        ArrayList<Item> rentList = new ArrayList<>();
        Book book1 = new Book(new Book.Builder());
        book1.setItemName("item1");
        book1.setPublisher("description1");
        book1.setPrice(1);
        rentList.add(book1);
        Book book2 = new Book(new Book.Builder());
        book2.setItemName("item2");
        book2.setPublisher("description2");
        book2.setPrice(2);
        rentList.add(book2);
        assertEquals("item1,description1,1\nitem2,description2,2\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithCD() {
        ArrayList<Item> rentList = new ArrayList<>();
        CD_DVD cd = new CD_DVD(new CD_DVD.Builder());
        cd.setItemName("item1");
        cd.setPublisher("description1");
        cd.setPrice(1);
        rentList.add(cd);
        assertEquals("item1,description1,1\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithMagazine() {
ArrayList<Item> rentList = new ArrayList<>();
        Magazine magazine = new Magazine(new Magazine.Builder());
        magazine.setItemName("item1");
        magazine.setPublisher("description1");
        magazine.setPrice(1);
        rentList.add(magazine);
        assertEquals("item1,description1,1\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithAllItems() {
        ArrayList<Item> rentList = new ArrayList<>();
        Book book = new Book(new Book.Builder());
        book.setItemName("item1");
        book.setPublisher("description1");
        book.setPrice(1);
        rentList.add(book);
        CD_DVD cd = new CD_DVD(new CD_DVD.Builder());
        cd.setItemName("item2");
        cd.setPublisher("description2");
        cd.setPrice(2);
        rentList.add(cd);
        Magazine magazine = new Magazine(new Magazine.Builder());
        magazine.setItemName("item3");
        magazine.setPublisher("description3");
        magazine.setPrice(3);
        rentList.add(magazine);
        assertEquals("item1,description1,1\nitem2,description2,2\nitem3,description3,3\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSeralizeItemListWithNull() {
        assertEquals("", RentListController.serializeItemList(null));
    }

    @Test
    public void testSerializeItemListWithEmptyItem() {
        ArrayList<Item> rentList = new ArrayList<>();
        rentList.add(null);
        assertEquals("", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithEmptyItemName() {
        ArrayList<Item> rentList = new ArrayList<>();
        Book book = new Book(new Book.Builder());
        book.setItemName("");
        book.setPublisher("description1");
        book.setPrice(1);
        rentList.add(book);
        assertEquals(",description1,1\n", RentListController.serializeItemList(rentList));
    }

    @Test
    public void testSerializeItemListWithEmptyPublisher() {
        ArrayList<Item> rentList = new ArrayList<>();
        Book book = new Book(new Book.Builder());
        book.setItemName("item1");
        book.setPublisher("");
        book.setPrice(1);
        rentList.add(book);
        assertEquals("item1,,1\n", RentListController.serializeItemList(rentList));
    }
}
