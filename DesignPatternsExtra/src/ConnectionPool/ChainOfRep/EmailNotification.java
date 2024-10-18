package ConnectionPool.ChainOfRep;

public class EmailNotification extends NotificationService{
    @Override
    public void handleEvent(SensorEvent event) {
        if (event.type.equals("Fire") || event.type.equals("Water") || event.type.equals("Intrusion")) {
            System.out.println("Email notification: " + event.type);
        } else {
            if (nextHandler != null) {
                nextHandler.handleEvent(event);
            }
        }
    }
}
