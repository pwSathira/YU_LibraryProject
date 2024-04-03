package yorku.eecs.testing;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;
import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.item.NewsletterController;
import yorku.eecs.controller.user.UserController;
import yorku.eecs.model.user.User;
import yorku.eecs.model.user.UserFactory;


public class NewsletterTestCases {

    User user;
    ArrayList<String> subscribeList = new ArrayList<>();

    /*
    @Test
    public void testUserCreation() throws ControllerError {
        String userName = "Isaiah";
        String firstName = "Isaiah";
        String lastName = "Gocool";
        String password = "testpassword";
        String id = "200000012";
        String email = "isaiah@my.yorku.ca";
        String type = "Student";
        User user = UserFactory.createUser(type, id, password);
        UserController userController = new UserController();
        user = userController.createUser(user);
        this.user = user;
        assertEquals("200000012", user.getStringId());
        assertEquals(200000012, user.getId());
        assertEquals("testpassword", user.getPassword());
    }
    */

    @Test
    public void testNewsletterSubscription() throws ControllerError {
        String userName = "Isaiah2";
        String firstName = "Isaiah2";
        String lastName = "Gocool";
        String password = "testpassword";
        String id = "200000004";
        String email = "isaiah2@my.yorku.ca";
        String type = "Student";
        User user = UserFactory.createUser(type, id, password);
        UserController userController = new UserController();
        user = userController.createUser(user);
        this.user = user;
        NewsletterController newsletterController = new NewsletterController();
        newsletterController.subscribe(user, "NYTimes");
        // ArrayList<String> subscribeList = new ArrayList<>();
        this.subscribeList.add("NYTimes");
        ArrayList<String> subscribeListTest = user.getSubscribedList();
        assertEquals(subscribeListTest, this.subscribeList);
    }

    @Test
    public void testUnsubscribeNewsletter() throws ControllerError {
        /*
        String userName = "Isaiah3";
        String firstName = "Isaiah3";
        String lastName = "Gocool";
        String password = "testpassword";
        String id = "200000015";
        String email = "isaiah3@my.yorku.ca";
        String type = "Student";
        User user = UserFactory.createUser(type, id, password);
        UserController userController = new UserController();
        user = userController.createUser(user);
        */
        NewsletterController newsletterController = new NewsletterController();
        newsletterController.subscribe(this.user, "Guardian");
        ArrayList<String> subscribeList = new ArrayList<>();
        this.subscribeList.add("Guardian");
        newsletterController.unsubscribe(this.user, "Guardian");
        this.subscribeList.remove("Guardian");
        newsletterController.unsubscribe(this.user, "NYTimes");
        this.subscribeList.remove("NYTimes");
        assertEquals(this.user.getSubscribedList(), this.subscribeList);
    }

    @Test
    public void testMultipleSubscriptions() {
        NewsletterController newsletterController = new NewsletterController();
        newsletterController.subscribe(this.user, "NYTimes");
        newsletterController.subscribe(this.user, "Guardian");
        newsletterController.subscribe(this.user, "Bloomberg");
        this.subscribeList.add("NYTimes");
        this.subscribeList.add("Guardian");
        this.subscribeList.add("Bloomberg");
        assertEquals(this.user.getSubscribedList(), this.subscribeList);
    }

    @Test
    public void testMultipleUnsubscriptions() {
        NewsletterController newsletterController = new NewsletterController();
        newsletterController.unsubscribe(this.user, "Bloomberg");
        newsletterController.unsubscribe(this.user, "Guardian");
        newsletterController.unsubscribe(this.user, "NYTimes");
        this.subscribeList.remove("Bloomberg");
        this.subscribeList.remove("Guardian");
        this.subscribeList.remove("NYTimes");
        assertEquals(this.user.getSubscribedList(), this.subscribeList);
    }

}
