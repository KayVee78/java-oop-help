import java.sql.Timestamp;

public class AccountTransferEvent implements Event {
    private final Long createTimeStamp;
    private final String id;

    public AccountTransferEvent(String id) {
        this.createTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer their service. Reaching out to CTE to remove service from old device and add service to new device");
    }
}
