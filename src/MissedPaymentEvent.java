import java.sql.Timestamp;

public class MissedPaymentEvent implements Event {
    private final Long createTimeStamp;
    private final String id;

    public MissedPaymentEvent(String id) {
        this.createTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment. " + "Sending a bill to the customer.");
    }
}
