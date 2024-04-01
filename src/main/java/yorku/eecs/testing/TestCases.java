package yorku.eecs.testing;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import yorku.eecs.*;
import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.user.UserController;
import yorku.eecs.model.item.Item;
import yorku.eecs.model.user.Student;
import yorku.eecs.model.user.User;
import yorku.eecs.model.user.UserFactory;


public class TestCases {

    @Test
    public void testUserCreation() throws ControllerError {
        String userName = "Isaiah";
        String firstName = "Isaiah";
        String lastName = "Gocool";
        String password = "testpassword";
        String id = "200000004";
        String email = "isaiah@my.yorku.ca";
        String type = "Student";
        User user = UserFactory.createUser(type, id, password);
        UserController userController = new UserController();
        user = userController.createUser(user);

    }

}
