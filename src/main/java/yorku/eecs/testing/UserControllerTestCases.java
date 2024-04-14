package yorku.eecs.testing;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.user.UserController;
import yorku.eecs.model.user.*;
import yorku.eecs.model.item.*;
import yorku.eecs.model.user.Student;
import java.util.ArrayList;
import java.util.List;

public class UserControllerTestCases {

    Student student;
    Visitor visitor;
    Admin admin;
    NonFaculty nonFaculty;
    Faculty faculty;
    @Test
    public void testStudentUserCreation() throws ControllerError {
        UserController userController = new UserController();
        student.setUserName("UserName");
        student.setId(12345);
        student.setPassword("Password");
        student.setEmailAddress("Email");
        student = (Student) userController.createUser(student);
        assertEquals(userController.readUser(student.getStringId(), "Student"), student);
    }

    @Test
    public void testVisitorUserCreation() throws ControllerError {
        UserController userController = new UserController();
        visitor.setUserName("UserName");
        visitor.setId(12345);
        visitor.setPassword("Password");
        visitor.setEmailAddress("Email");
        visitor = (Visitor) userController.createUser(visitor);
        assertEquals(userController.readUser(visitor.getStringId(), "Visitor"), visitor);
    }

    @Test
    public void testAdminUserCreation() throws ControllerError {
        UserController userController = new UserController();
        admin.setUserName("UserName");
        admin.setId(12345);
        admin.setPassword("Password");
        admin.setEmailAddress("Email");
        admin = (Admin) userController.createUser(admin);
        assertEquals(userController.readUser(admin.getStringId(), "Admin"), admin);
    }

    @Test
    public void testFacultyUserCreation() throws ControllerError {
        UserController userController = new UserController();
        faculty.setUserName("UserName");
        faculty.setId(12345);
        faculty.setPassword("Password");
        faculty.setEmailAddress("Email");
        faculty = (Faculty) userController.createUser(faculty);
        assertEquals(userController.readUser(faculty.getStringId(), "Faculty"), faculty);
    }

    @Test
    public void testStudentExists() throws ControllerError {
        UserController userController = new UserController();
        assertTrue(userController.checkUserExists(student));
    }

    @Test
    public void testVisitorExists() throws ControllerError {
        UserController userController = new UserController();
        assertTrue(userController.checkUserExists(visitor));
    }

    @Test
    public void testFacultyExists() throws ControllerError {
        UserController userController = new UserController();
        assertTrue(userController.checkUserExists(faculty));
    }

    @Test
    public void testNonFacultyExists() throws ControllerError {
        UserController userController = new UserController();
        assertTrue(userController.checkUserExists(nonFaculty));
    }

    @Test
    public void testUserDeletion() throws ControllerError {
        UserController userController = new UserController();
        userController.deleteUser(student);
        assertFalse(userController.checkUserExists(student));
    }

    @Test
    public void testVisitorDeletion() throws ControllerError {
        UserController userController = new UserController();
        userController.deleteUser(visitor);
        assertFalse(userController.checkUserExists(visitor));
    }
}
