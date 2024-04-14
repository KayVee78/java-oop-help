//Challenge - to reduce application complexity and code duplication
public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("321928399");
        AccountTransferEvent eventTwo = new AccountTransferEvent("192399202");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("47328299");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
