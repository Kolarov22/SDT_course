package ConnectionPool;

public class Client extends Thread{
    private DBConnectionPool pool;
    private int id;

    public Client(DBConnectionPool pool, int id) {
        this.pool = pool;
        this.id = id;
    }

    @Override
    public void run() {
        DBConnection conn = pool.getConnection();
        if (conn != null) {
            System.out.println("Client " + this.id + " got connection " + conn);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pool.returnConnection(conn);
            System.out.println("Client " + this.id + " returned connection " + conn);
        } else {
            System.out.println("Client " + this.id + " couldn't get connection");
        }
    }

    public static void main(String[] args) {
        DBConnectionPool pool = DBConnectionPool.getInstance();
        for (int i = 0; i < 3; i++) {
            new Client(pool, i).start();
        }
    }
}
