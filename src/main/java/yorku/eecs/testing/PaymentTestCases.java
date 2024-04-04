package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import yorku.eecs.model.payment.Subscription;

public class PaymentTestCases {

    Subscription sub = new Subscription();


    @Test
    public void TestSetDurationDays() {
        sub.setDuration(5);
        Assert.assertEquals(sub.getDuration(), 5);
    }

    @Test
    public void TestGetDurationDays() {
        sub.setDuration(5);
        int duration = sub.getDuration();
        Assert.assertEquals(duration, 5);
    }

    @Test
    public void TestSetPrice() {
        sub.setPrice(20);
        Assert.assertEquals(sub.getPrice(), 20);
    }

    @Test
    public void TestGetPrice() {
        sub.setPrice(20);
        double price = sub.getPrice();
        Assert.assertEquals(price, 20);
    }
    @Test
    public void TestSetPriceDecimal() {
        sub.setPrice(20.00);
        Assert.assertEquals(sub.getPrice(), 20.00);
    }

    @Test
    public void TestGetPriceDecimal() {
        sub.setPrice(20.00);
        double price = sub.getPrice();
        Assert.assertEquals(price, 20.00);
    }

    @Test
    public void TestSetURL() {
        sub.setUrl("URL");
        Assert.assertEquals(sub.getUrl(), "URL");
    }
    @Test
    public void TestGetURL() {
        sub.setUrl("URL");
        String url = sub.getUrl();
        Assert.assertEquals(url, "URL");

    }

    @Test
    public void TestSetURLAlphaNum() {
        sub.setUrl("HTTPS://www.1234.com");
        Assert.assertEquals(sub.getUrl(), "HTTPS://www.1234.com");
    }
    @Test
    public void TestGetURLAlphaNum() {
        sub.setUrl("HTTPS://www.1234.com");
        String url = sub.getUrl();
        Assert.assertEquals(url, "HTTPS://www.1234.com");

    }


}
