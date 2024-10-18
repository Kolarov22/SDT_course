package ChainOfRep;

public class Logger extends NotificationService{
    public void handleEvent(SensorEvent event) {
        if (event.type.equals("Fire")||  event.type.equals("Intrusion") || event.type.equals("Water") || event.type.equals("Temperature")) {
            System.out.println("Logged event of type: " + event.type);
        } else {
            if (nextHandler != null) {
                nextHandler.handleEvent(event);
            }
        }
    }
}
