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

    Visitor visitor = new Visitor("ID", "Password");



    //Faculty
    @Test
    public void testSetFirstNameFaculty() {
        faculty.setFirstName("FirstName");
        Assert.assertEquals(faculty.getFirstName(), "FirstName");
    }

    @Test
    public void testGetFirstNameFaculty() {
        faculty.setFirstName("FirstName");
        String firstName = faculty.getFirstName();

        assertEquals(firstName, "FirstName");
    }

    @Test
    public void testSetUserNameFaculty() {
        faculty.setUserName("Faculty");

        assertEquals(faculty.getUserName(), "Faculty");
    }

    @Test
    public void testGetUserNameFaculty() {
        faculty.setUserName("Faculty");
        String userName = faculty.getUserName();

        assertEquals(userName, "Faculty");
    }

    @Test
    public void testSetLastNameFaculty() {
        faculty.setLastName("LastName");

        assertEquals(faculty.getLastName(), "LastName");
    }

    @Test
    public void testGetLastNameFaculty() {
        faculty.setLastName("LastName");
        String lastName = faculty.getLastName();

        assertEquals(lastName, "LastName");
    }
    @Test
    public void testSetPasswordNameFaculty() {
        faculty.setPassword("Password");

        assertEquals(faculty.getPassword(), "Password");
    }

    @Test
    public void testGetPasswordFaculty() {
        faculty.setPassword("Password");
        String password = faculty.getPassword();

        assertEquals(password, "Password");
    }
    @Test
    public void testSetIdFaculty() {
        faculty.setId(2000000000);

        assertEquals(faculty.getId(), 2000000000);
    }

    @Test
    public void testGetIdFaculty() {
        faculty.setId(2000000000);
        int id = faculty.getId();

        assertEquals(id, 2000000000);
    }
    @Test
    public void testSetEmailAddressFaculty() {
        faculty.setEmailAddress("email");

        assertEquals(faculty.getEmailAddress(), "email");
    }

    @Test
    public void testGetEmailAddressFaculty() {
        faculty.setEmailAddress("email");
        String emailAddress = faculty.getEmailAddress();

        assertEquals(emailAddress, "email");
    }

    //Non-Faculty
    @Test
    public void testSetFirstNameNonFaculty() {
        nf.setFirstName("FirstName");
        Assert.assertEquals(nf.getFirstName(), "FirstName");
    }

    @Test
    public void testGetFirstNameNonFaculty() {
        nf.setFirstName("FirstName");
        String firstName = nf.getFirstName();

        assertEquals(firstName, "FirstName");
    }

    @Test
    public void testSetUserNameNonFaculty() {
        nf.setUserName("NF");

        assertEquals(nf.getUserName(), "NF");
    }

    @Test
    public void testGetUserNameNonFaculty() {
        nf.setUserName("NF");
        String userName = nf.getUserName();

        assertEquals(userName, "NF");
    }

    @Test
    public void testSetLastNameNonFaculty() {
        nf.setLastName("LastName");

        assertEquals(nf.getLastName(), "LastName");
    }

    @Test
    public void testGetLastNameNonFaculty() {
        nf.setLastName("LastName");
        String lastName = nf.getLastName();

        assertEquals(lastName, "LastName");
    }
    @Test
    public void testSetPasswordNameNonFaculty() {
        nf.setPassword("Password");

        assertEquals(nf.getPassword(), "Password");
    }

    @Test
    public void testGetPasswordNonFaculty() {
        nf.setPassword("Password");
        String password = nf.getPassword();

        assertEquals(password, "Password");
    }
    @Test
    public void testSetIdNonFaculty() {
        nf.setId(2000000001);

        assertEquals(nf.getId(), 2000000001);
    }

    @Test
    public void testGetIdNonFaculty() {
        nf.setId(2000000000);
        int id = nf.getId();

        assertEquals(id, 2000000001);
    }
    @Test
    public void testSetEmailAddressNonFaculty() {
        nf.setEmailAddress("email");

        assertEquals(nf.getEmailAddress(), "email");
    }

    @Test
    public void testGetEmailAddressNonFaculty() {
        nf.setEmailAddress("email");
        String emailAddress = nf.getEmailAddress();

        assertEquals(emailAddress, "email");
    }


    //Visitor
    @Test
    public void testSetFirstNameVisitor() {
        visitor.setFirstName("FirstName");
        Assert.assertEquals(visitor.getFirstName(), "FirstName");
    }

    @Test
    public void testGetFirstNameVisitor() {
        visitor.setFirstName("FirstName");
        String firstName = visitor.getFirstName();

        assertEquals(firstName, "FirstName");
    }

    @Test
    public void testSetUserNameVisitor() {
        visitor.setUserName("Visitor");

        assertEquals(visitor.getUserName(), "Visitor");
    }

    @Test
    public void testGetUserNameVisitor() {
        visitor.setUserName("Visitor");
        String userName = visitor.getUserName();

        assertEquals(userName, "Visitor");
    }

    @Test
    public void testSetLastNameVisitor() {
        visitor.setLastName("LastName");

        assertEquals(visitor.getLastName(), "LastName");
    }

    @Test
    public void testGetLastNameVisitor() {
        visitor.setLastName("LastName");
        String lastName = visitor.getLastName();

        assertEquals(lastName, "LastName");
    }
    @Test
    public void testSetPasswordNameVisitor() {
        visitor.setPassword("Password");

        assertEquals(visitor.getPassword(), "Password");
    }

    @Test
    public void testGetPasswordVisitor() {
        visitor.setPassword("Password");
        String password = visitor.getPassword();

        assertEquals(password, "Password");
    }
    @Test
    public void testSetIdVisitor() {
        visitor.setId(2000000005);

        assertEquals(visitor.getId(), 2000000005);
    }

    @Test
    public void testGetIdVisitor() {
        nf.setId(2000000005);
        int id = nf.getId();

        assertEquals(id, 2000000005);
    }
    @Test
    public void testSetEmailAddressVisitor() {
        visitor.setEmailAddress("email");

        assertEquals(visitor.getEmailAddress(), "email");
    }

    @Test
    public void testGetEmailAddressVisitor() {
        visitor.setEmailAddress("email");
        String emailAddress = visitor.getEmailAddress();

        assertEquals(emailAddress, "email");
    }


    //Student
    @Test
    public void testSetFirstNameStudent() {
        student.setFirstName("FirstName");
        Assert.assertEquals(student.getFirstName(), "FirstName");
    }

    @Test
    public void testGetFirstNameStudent() {
        student.setFirstName("FirstName");
        String firstName = student.getFirstName();

        assertEquals(firstName, "FirstName");
    }

    @Test
    public void testSetUserNameStudent() {
        student.setUserName("Student");

        assertEquals(student.getUserName(), "Student");
    }

    @Test
    public void testGetUserNameStudent() {
        student.setUserName("Student");
        String userName = student.getUserName();

        assertEquals(userName, "Student");
    }

    @Test
    public void testSetLastNameStudent() {
        student.setLastName("LastName");

        assertEquals(student.getLastName(), "LastName");
    }

    @Test
    public void testGetLastNameStudent() {
        student.setLastName("LastName");
        String lastName = student.getLastName();

        assertEquals(lastName, "LastName");
    }
    @Test
    public void testSetPasswordNameStudent() {
        student.setPassword("Password");

        assertEquals(student.getPassword(), "Password");
    }

    @Test
    public void testGetPasswordStudent() {
        student.setPassword("Password");
        String password = student.getPassword();

        assertEquals(password, "Password");
    }
    @Test
    public void testSetIdStudent() {
        student.setId(2000000002);

        assertEquals(student.getId(), 2000000002);
    }

    @Test
    public void testGetIdStudent() {
        student.setId(2000000002);
        int id = student.getId();

        assertEquals(id, 2000000002);
    }
    @Test
    public void testSetEmailAddressStudent() {
        student.setEmailAddress("email");

        assertEquals(student.getEmailAddress(), "email");
    }

    @Test
    public void testGetEmailAddressStudent() {
        student.setEmailAddress("email");
        String emailAddress = student.getEmailAddress();

        assertEquals(emailAddress, "email");
    }

    //Admin
    @Test
    public void testSetFirstNameAdmin() {
        admin.setFirstName("FirstName");
        Assert.assertEquals(admin.getFirstName(), "FirstName");
    }

    @Test
    public void testGetFirstNameAdmin() {
        admin.setFirstName("FirstName");
        String firstName = admin.getFirstName();

        assertEquals(firstName, "FirstName");
    }

    @Test
    public void testSetUserNameAdmin() {
        admin.setUserName("Admin");

        assertEquals(admin.getUserName(), "Admin");
    }

    @Test
    public void testGetUserNameAdmin() {
        admin.setUserName("Admin");
        String userName = admin.getUserName();

        assertEquals(userName, "Admin");
    }

    @Test
    public void testSetLastNameAdmin() {
        admin.setLastName("LastName");

        assertEquals(admin.getLastName(), "LastName");
    }

    @Test
    public void testGetLastNameAdmin() {
        admin.setLastName("LastName");
        String lastName = admin.getLastName();

        assertEquals(lastName, "LastName");
    }
    @Test
    public void testSetPasswordNameAdmin() {
        admin.setPassword("Password");

        assertEquals(admin.getPassword(), "Password");
    }

    @Test
    public void testGetPasswordAdmin() {
        admin.setPassword("Password");
        String password = admin.getPassword();

        assertEquals(password, "Password");
    }
    @Test
    public void testSetIdAdmin() {
        student.setId(1000000000);

        assertEquals(student.getId(), 1000000000);
    }

    @Test
    public void testGetIdAdmin() {
        admin.setId(1000000000);
        int id = admin.getId();

        assertEquals(id, 1000000000);
    }
    @Test
    public void testSetEmailAddressAdmin() {
        admin.setEmailAddress("email");

        assertEquals(admin.getEmailAddress(), "email");
    }

    @Test
    public void testGetEmailAddressAdmin() {
        admin.setEmailAddress("email");
        String emailAddress = admin.getEmailAddress();

        assertEquals(emailAddress, "email");
    }







    //User Test Cases

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
