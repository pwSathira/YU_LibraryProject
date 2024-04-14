package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import yorku.eecs.model.user.*;

import static yorku.eecs.model.user.UserFactory.determineUser;

public class UserFactoryTestCases {

    @Test
    public void testStudentCreateUser() {
        User user = UserFactory.createUser("Student", "123", "password");
        Assert.assertEquals(user.getId(), 123);
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testFacultyCreateUser() {
        User user = UserFactory.createUser("Faculty", "123", "password");
        Assert.assertEquals(user.getId(), 123);
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testNonFacultyCreateUser() {
        User user = UserFactory.createUser("NonFaculty", "123", "password");
        Assert.assertEquals(user.getId(), 123);
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testAdminCreateUser() {
        User user = UserFactory.createUser("Admin", "123", "password");
        Assert.assertEquals(user.getId(), 123);
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testVisitorCreateUser() {
        User user = UserFactory.createUser("Admin", "123", "password");
        Assert.assertEquals(user.getId(), 123);
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testStudentDetermineUser() {
        User user = determineUser("Student");
        Assert.assertEquals(user instanceof Student, true);
    }

    @Test
    public void testNonFacultyDetermineUser() {
        User user = determineUser("NonFaculty");
        Assert.assertEquals(user instanceof NonFaculty, true);
    }

    @Test
    public void testFacultyDetermineUser() {
        User user = determineUser("Faculty");
        Assert.assertEquals(user instanceof Faculty, true);
    }

    @Test
    public void testVisitorDetermineUser() {
        User user = determineUser("Visitor");
        Assert.assertEquals(user instanceof Visitor, true);
    }

    @Test
    public void testAdminDetermineUser() {
        User user = determineUser("Admin");
        Assert.assertEquals(user instanceof Admin, true);
    }












}
