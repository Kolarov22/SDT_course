package ConnectionPool;

public class DBConnection implements DBConnectionI{
    private static int id;
    private static int currentConnections = 0;
    private String dbUrl;

    public DBConnection() {
        id = currentConnections++;
        dbUrl = "Connection " + id;
    }

    @Override
    public void connect() {
        System.out.println("Connection " + this.id + " was aquired by " + Thread.currentThread().getName());

    }

    @Override
    public void disconnect() {
        System.out.println("Connection " + this.id + " was released by " + Thread.currentThread().getName());
    }


}
