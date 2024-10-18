package ChainOfRep;

public class TelephoneNotification extends NotificationService{
    @Override
    public void handleEvent(SensorEvent event) {
        if (event.type.equals("Fire")|| event.type.equals("Intrusion")) {
            System.out.println("Telephone notification: " + event.type);
        } else {
            if (nextHandler != null) {
                nextHandler.handleEvent(event);
            }
        }
    }
}
