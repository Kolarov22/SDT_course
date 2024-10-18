package ConnectionPool.ChainOfRep;

public abstract class NotificationService {
    protected NotificationService nextHandler;

    public void setNextHandler(NotificationService s) {
        this.nextHandler = s;
    }

    public void handleEvent( SensorEvent event ){
        if (nextHandler != null) {
            nextHandler.handleEvent(event);
        }
    }
}
