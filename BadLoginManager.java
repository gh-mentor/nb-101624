import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BadLoginManager {
    private String dbName;
    private Connection conn;
    private Statement stmt;

    public BadLoginManager(String dbName) {
        this.dbName = dbName;
        this.conn = null;
        this.stmt = null;
    }

    public void connectToDb() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + dbName);
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(String username, String password) {
        connectToDb();
        boolean loginSuccessful = false;

        try {
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                loginSuccessful = true; // Login successful
            } else {
                loginSuccessful = false; // Login failed
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return loginSuccessful;
    }

    public static void main(String[] args) {
        BadLoginManager manager = new BadLoginManager("example.db");
        boolean result = manager.login("admin", "password");
        System.out.println("Login successful: " + result);
    }
}