package ConnectionPool.ChainOfRep;

import java.util.Date;

public class SensorEvent extends Thread {
    protected String type;
    protected Date timestamp;
    protected String location;

    public SensorEvent(String type, Date timestamp, String location) {
        this.type = type;
        this.timestamp = timestamp;
        this.location = location;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Sensor Event: " + type + " at " + location + " at " + timestamp);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
