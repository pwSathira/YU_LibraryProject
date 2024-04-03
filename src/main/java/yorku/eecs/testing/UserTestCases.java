package yorku.eecs.testing;

import org.junit.Test;
import static org.junit.Assert.*;
import yorku.eecs.model.user.User;
import yorku.eecs.model.user.UserFactory;

public class UserTestCases {


    String type = "Student";
    String id = "200000050";
    String password = "testpassword";
    User user = UserFactory.createUser(type, id, password);


    @Test
    public void testGetFirstName() {
        user.setFirstName("john");
        assertEquals("john", user.getFirstName());
    }




}
