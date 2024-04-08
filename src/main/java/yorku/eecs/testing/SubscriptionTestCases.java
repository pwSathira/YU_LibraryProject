package yorku.eecs.testing;
import org.junit.Before;
import yorku.eecs.model.payment.PaymentMethod;
import yorku.eecs.model.payment.Subscription;
import static org.junit.Assert.*;
import org.junit.Test;
public class SubscriptionTestCases {

    @Test
    public void testSubscriptionConstructor(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        assertEquals(25.0, subs.getPrice());
        assertEquals(15, subs.getDuration());
        assertEquals("http://medleydiaries.com", subs.getUrl());
    }

    @Test
    public void testGetPrice(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        assertEquals(25.0, subs.getPrice());
    }

    @Test
    public void testSetPrice(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        subs.setPrice(100.0);
        assertEquals(100.0, subs.getPrice());
    }

    @Test
    public void testGetDuration(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        assertEquals(15, subs.getDuration());
    }

    @Test
    public void testSetDuration(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        subs.setDuration(31);
        assertEquals(31, subs.getDuration());
    }

    @Test
    public void testGetUrl(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        assertEquals("http://medleydiaries.com", subs.getUrl());
    }

    @Test
    public void testSetUrl(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        subs.setUrl("this is the new url");
        assertEquals("this is the new url", subs.getUrl());
    }

    @Test
    public void testSubscriptionDefaultConstructor(){
        Subscription subs = new Subscription();
        assertEquals(null, subs);
    }

    @Test
    public void testSubscriptionEquals(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        Subscription subs1 = new Subscription(25.0, 15, "http://medleydiaries.com");
        assertEquals(subs, subs1);
    }

    @Test
    public void testAll(){
        Subscription subs = new Subscription(25.0, 15, "http://medleydiaries.com");
        subs.setUrl("news");
        subs.setPrice(2002.0);
        subs.setDuration(9);
        assertEquals(new Subscription(2002.0, 9, "news"), subs);
    }

}
