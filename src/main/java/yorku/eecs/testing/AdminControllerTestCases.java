package yorku.eecs.testing;

import org.junit.Test;
import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.item.ItemController;
import yorku.eecs.controller.user.AdminController;
import yorku.eecs.controller.user.UserController;
import yorku.eecs.model.item.Book;
import yorku.eecs.model.item.CD_DVD;
import yorku.eecs.model.item.Magazine;
import yorku.eecs.model.item.Textbook;
import yorku.eecs.model.user.Student;
import yorku.eecs.model.user.User;
import yorku.eecs.model.user.UserFactory;


import static org.junit.Assert.assertEquals;

public class AdminControllerTestCases {

    Book book = new Book.Builder().build();

    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    Textbook text = new Textbook.Builder().build();
    String type = "Student";
    String id = "200000050";
    String password = "testpassword";
    User user = UserFactory.createUser(type, id, password);
    Student student;
    @Test
    public void testCreateBook() throws ControllerError {
        book.setItemID(1234);
        book.setItemName("Book name");
        book.setLocation("Library");
        book.setQuantity(20);
        book.setExpiryDate("Date");
        book.setPublisher("Publisher");
        book.setPrice(5);
        book.setISBN("123456789");
        AdminController adminController = new AdminController();
        ItemController itemController = new ItemController();
        adminController.createItem(book);
        assertEquals(itemController.readItem(book.getStringId(), "Book"), book);
    }

    @Test
    public void testCreateCD() throws ControllerError {
        cd.setItemID(2222);
        cd.setItemName("CD name");
        cd.setLocation("Library");
        cd.setQuantity(20);
        cd.setExpiryDate("Date");
        cd.setPublisher("Publisher");
        cd.setPrice(5);
        cd.setUPC("123456789");
        AdminController adminController = new AdminController();
        ItemController itemController = new ItemController();
        adminController.createItem(cd);
        assertEquals(itemController.readItem(cd.getStringId(), "cd"), cd);
    }


    @Test
    public void testCreateMagazine() throws ControllerError {
        mag.setItemID(3333);
        mag.setItemName("Magazine name");
        mag.setLocation("Library");
        mag.setQuantity(20);
        mag.setExpiryDate("Date");
        mag.setPublisher("Publisher");
        mag.setPrice(5);
        mag.setISSN("123456789");
        AdminController adminController = new AdminController();
        ItemController itemController = new ItemController();
        adminController.createItem(mag);
        assertEquals(itemController.readItem(mag.getStringId(), "Magazine"), mag);
    }

    @Test
    public void testCreateTextbook() throws ControllerError {
        text.setItemID(4444);
        text.setItemName("Magazine name");
        text.setLocation("Library");
        text.setQuantity(20);
        text.setExpiryDate("Date");
        text.setPublisher("Publisher");
        text.setPrice(5);
        text.setISBN("123456789");;
        AdminController adminController = new AdminController();
        ItemController itemController = new ItemController();
        adminController.createItem(book);
        assertEquals(itemController.readItem(book.getStringId(), "Book"), book);
    }

    @Test
    public void testUserCreationStudent() throws ControllerError {
        AdminController adminController = new AdminController();
        student.setUserName("UserName");
        student.setId(12345);
        student.setPassword("Password");
        student.setEmailAddress("Email");
        student = (Student) adminController.createUser(student);
        assertEquals(adminController.readUser(student.getStringId(), "Student"), student);
    }

    @Test
    public void testTypeStudent() throws ControllerError {
        AdminController adminController = new AdminController();
        String type = adminController.determineUserType(user.getStringId());
        assertEquals(type,"Student");
    }


    @Test
    public void testTypeFaculty() throws ControllerError {
        AdminController adminController = new AdminController();
        String type = adminController.determineUserType(user.getStringId());
        assertEquals(type,"Faculty");
    }

    @Test
    public void testTypeNonFaculty() throws ControllerError {
        AdminController adminController = new AdminController();
        String type = adminController.determineUserType(user.getStringId());
        assertEquals(type,"Non Faculty");
    }

    @Test
    public void testTypeVisitor() throws ControllerError {
        AdminController adminController = new AdminController();
        String type = adminController.determineUserType(user.getStringId());
        assertEquals(type,"Visitor");
    }

    @Test
    public void testUpdateBook() throws ControllerError {
        AdminController adminController = new AdminController();
        ItemController itemController = new ItemController();
        adminController.updateItem(book);
        assertEquals(itemController.readItem(book.getStringId(), "book"), book);
    }
}
