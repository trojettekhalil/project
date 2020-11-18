package Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {

    private String url = "jdbc:mysql://127.0.0.1:3306/alinfo3";
    private String login = "alinfo3";
    private String password = "alinfo3";

    private Connection connection;

    static MyConnection instance;

    private MyConnection() {
        try {
            connection = DriverManager.getConnection(url, login, password);
            System.out.println("Connexion établie");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MyConnection getInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        return instance;
    }

}
