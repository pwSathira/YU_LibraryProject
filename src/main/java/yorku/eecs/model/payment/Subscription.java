package yorku.eecs.model.payment;

import yorku.eecs.model.payment.PaymentMethod;

public class Subscription {

    private double price;
    private int durationDays;
    private String url;
    private PaymentMethod paymentMethod;


    public Subscription(){}
    public Subscription(double price, int durationDays, String url){
        this.price = price;
        this.durationDays = durationDays;
        this.url = url;
    }
    public int getDuration() {
        return durationDays;
    }

    public void setDuration(int durationDays) {
        this.durationDays = durationDays;
    }


    public double getPrice () {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getUrl() {
        return new String(this.url);
    }

    public void setUrl(String url) {
        this.url = new String(url);
    }
}
