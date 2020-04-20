package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mysql?verifyServerCertificate=false&useSSL=true";
        String uName = "root";
        String pass = "Kshv@wrkfr28";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, uName, pass);
    }
}
