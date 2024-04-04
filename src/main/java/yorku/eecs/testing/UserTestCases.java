package yorku.eecs.testing;

import org.junit.Test;
import static org.junit.Assert.*;

import yorku.eecs.model.user.*;
import yorku.eecs.model.item.*;
import java.util.ArrayList;
import java.util.List;

public class UserTestCases {


    String type = "Student";
    String id = "200000050";
    String password = "testpassword";
    User user = UserFactory.createUser(type, id, password);

    Book book = new Book.Builder().build();
    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    Textbook text = new Textbook.Builder().build();

    Admin admin = new Admin(1000000000, "Admin", "FirstName", "LastName", "email", "Password");
    Faculty faculty = new Faculty();
    NonFaculty nonFaculty = new NonFaculty();

    Student student = new Student();


    @Test
    public void testSetFirstName() {
        user.setFirstName("john");

        assertEquals("john", user.getFirstName());
    }

    @Test
    public void testGetFirstName() {
        user.setFirstName("john");
        String firstName = user.getFirstName();

        assertEquals("john",firstName);
    }

    @Test
    public void testSetUserName() {
        user.setUserName("john");

        assertEquals("john", user.getUserName());
    }

    @Test
    public void testGetUserName() {
        user.setUserName("john");
        String userName = user.getUserName();

        assertEquals("john",userName);
    }

    @Test
    public void testSetLastName() {
        user.setLastName("john");

        assertEquals("john", user.getLastName());
    }

    @Test
    public void testGetLastName() {
        user.setLastName("john");
        String lastName = user.getLastName();

        assertEquals("john",lastName);
    }
    @Test
    public void testSetPasswordName() {
        user.setPassword("john");

        assertEquals("john", user.getPassword());
    }

    @Test
    public void testGetPassword() {
        user.setPassword("john");
        String password = user.getPassword();

        assertEquals("john",password);
    }
    @Test
    public void testSetId() {
        user.setId(777);

        assertEquals(777, user.getId());
    }

    @Test
    public void testGetId() {
        user.setId(777);
        int id = user.getId();

        assertEquals(777,id);
    }
    @Test
    public void testSetEmailAddress() {
        user.setEmailAddress("john");

        assertEquals("john", user.getEmailAddress());
    }

    @Test
    public void testGetEmailAddress() {
        user.setEmailAddress("john");
        String emailAddress = user.getEmailAddress();

        assertEquals("john",emailAddress);
    }
    @Test
    public void testSetSubscribeList() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("john");
        subList.add("joe");
        user.setSubscribedList(subList);

        for (int i = 0; i < subList.size(); i++) {
            assertEquals(subList.get(i), user.getSubscribedList().get(i));
        }
    }

    @Test
    public void testGetSubscribeList() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("john");
        subList.add("joe");
        user.setSubscribedList(subList);
        ArrayList<String> subList2 = user.getSubscribedList();

        assertNotEquals(subList,subList2);
        for (int i = 0; i < subList.size(); i++) {
            assertEquals(subList.get(i),subList2.get(i));
        }
    }

    @Test
    public void testSetRentList() {
        ArrayList<Item> rentList = new ArrayList<>();
        rentList.add(book);
        rentList.add(cd);
        rentList.add(mag);
        rentList.add(text);
        user.setRentList(rentList);
        for (int i = 0; i < rentList.size(); i++) {
            assertEquals(rentList.get(i), user.getRentList().get(i));
        }
    }

    @Test
    public void testGetRentList() {
        ArrayList<Item> rentList = new ArrayList<>();
        rentList.add(book);
        rentList.add(cd);
        rentList.add(mag);
        rentList.add(text);
        user.setRentList(rentList);
        for (int i = 0; i < rentList.size(); i++) {
            assertEquals(rentList.get(i), user.getRentList().get(i));
        }
    }

    @Test
    public void testToCSV() {
        user.setId(777);
        user.setUserName("JDMAN");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmailAddress("JohnDoe@gmail.com");
        user.setPassword("123");

        ArrayList<String> tempList = new ArrayList<>();
        tempList.add(Integer.toString(user.getId()));
        tempList.add(user.getUserName());
        tempList.add(user.getFirstName());
        tempList.add(user.getLastName());
        tempList.add(user.getEmailAddress());
        tempList.add(user.getPassword());

        List<List<String>> tempList2 =  user.toCSV(777);

        for (int i = 0; i < tempList2.get(0).size(); i++) {
            assertEquals();
        }


    }

    @Test
    public void setStudentCourseList() {
        ArrayList courseList = new ArrayList();
    }




}
