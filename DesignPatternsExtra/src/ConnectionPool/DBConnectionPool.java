package ConnectionPool;

public class DBConnectionPool {
    private static DBConnectionPool instance = null;
    private static final int MAX_CONNECTIONS = 5;
    private static int currentConnections = 0;

    private DBConnectionPool() {
    }

    public static DBConnectionPool getInstance() {
        if (instance == null) {
            instance = new DBConnectionPool();
        }
        return instance;
    }

    public DBConnection getConnection() {
        if (currentConnections < MAX_CONNECTIONS) {
            currentConnections++;
            return new DBConnection();
        }
        return null;
    }

    public void returnConnection(DBConnection conn) {
        currentConnections--;
    }
}
