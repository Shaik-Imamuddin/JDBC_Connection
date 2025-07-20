import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbcconnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Your Mysql password");
       if (con != null) {
            System.out.println("Connection Established");
        } else {
            System.out.println("Connection not Established");
            return;
        }
    }
}