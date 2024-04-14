import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {
    protected Long createTimeStamp;
    protected String id;

    public AbstractEvent(String id) {
        this.createTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createTimeStamp;
    }

    @Override
    public abstract void process();
}
