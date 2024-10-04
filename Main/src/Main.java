import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = DatabaseConnector.connect();
        DatabaseOperations.insertRecord(conn, "John Doe", 30);
        // Add calls to other CRUD methods
    }
}