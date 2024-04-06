package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import yorku.eecs.model.user.*;
import yorku.eecs.model.item.*;
import yorku.eecs.model.user.Student;
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
    Faculty faculty = new Faculty(2000000000, "Faculty", "FirstName", "LastName", "email", "Password");
    NonFaculty nf = new NonFaculty(2000000001, "NF", "FirstName", "LastName", "email", "Password");

    Student student = new Student(2000000002, "Student", "FirstName", "LastName", "email", "Password");



    //Faculty
    @Test
    public void testSetFirstNameFaculty() {
        faculty.setFirstName("Test");
        Assert.assertEquals(faculty.getFirstName(), "Test");
    }

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

//    @Test
//    public void testToCSV() {
//        user.setId(777);
//        user.setUserName("JDMAN");
//        user.setFirstName("John");
//        user.setLastName("Doe");
//        user.setEmailAddress("JohnDoe@gmail.com");
//        user.setPassword("123");
//
//        ArrayList<String> tempList = new ArrayList<>();
//        tempList.add(Integer.toString(user.getId()));
//        tempList.add(user.getUserName());
//        tempList.add(user.getFirstName());
//        tempList.add(user.getLastName());
//        tempList.add(user.getEmailAddress());
//        tempList.add(user.getPassword());
//
//        List<List<String>> tempList2 =  user.toCSV(777);
//
//        for (int i = 0; i < tempList2.get(0).size(); i++) {
//            assertEquals();
//        }
//
//
//    }

    @Test
    public void setStudentCourseList() {
        ArrayList courseList = new ArrayList();
    }




    //Student Test Cases:-
    @Test
    public void testStudenConstructor(){}



    @Test
    public void testVisitorConstructor() {
        Visitor visitor = new Visitor("123", "123");
        assertEquals(visitor.getId(),123);
        assertEquals(visitor.getPassword(),"123)");
    }

    @Test
    public void testNonFacultyCreation() {
        NonFaculty nonFaculty = new NonFaculty(300000000, "NonFaculty", "FirstName", "LastName", "email", "Password");;
        nonFaculty.setUserName("johnDoe");
        nonFaculty.setFirstName("John");
        nonFaculty.setLastName("Doe");
        nonFaculty.setPassword("123456");
        nonFaculty.setId(1);
        nonFaculty.setEmailAddress("johndoe@example.com");

        assertEquals("johnDoe", nonFaculty.getUserName());
        assertEquals("John", nonFaculty.getFirstName());
        assertEquals("Doe", nonFaculty.getLastName());
        assertEquals("123456", nonFaculty.getPassword());
        assertEquals(1, nonFaculty.getId());
        assertEquals("johndoe@example.com", nonFaculty.getEmailAddress());
    }

    @Test
    public void testNonFacultySubscriptions() {
        NonFaculty nonFaculty = new NonFaculty(300000000, "NonFaculty", "FirstName", "LastName", "email", "Password");
        ArrayList<String> subscriptions = new ArrayList<>();
        subscriptions.add("Java Programming");
        subscriptions.add("Data Structures");

        nonFaculty.setSubscribedList(subscriptions);

        assertEquals(2, nonFaculty.getSubscribedList().size());
        assertEquals("Java Programming", nonFaculty.getSubscribedList().get(0));
        assertEquals("Data Structures", nonFaculty.getSubscribedList().get(1));
    }

    @Test
    public void testNonFacultyRentList() {
        NonFaculty nonFaculty = new NonFaculty(300000000, "NonFaculty", "FirstName", "LastName", "email", "Password");;
        ArrayList<Item> rentList = new ArrayList<>();
        rentList.add(new Book(new Book.Builder()));
        rentList.add(new Book(new Book.Builder()));
        rentList.get(0).setItemName("Laptop");
        rentList.get(1).setItemName("Projector");
        nonFaculty.setRentList(rentList);
        assertEquals(2, nonFaculty.getRentList().size());
        assertEquals("Laptop", nonFaculty.getRentList().get(0).getItemName());
        assertEquals("Projector", nonFaculty.getRentList().get(1).getItemName());
    }
}
