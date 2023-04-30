package sit.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection connection = null;
    
    
    private DBUtil()
    {}
    
    public static Connection getConnection() throws SQLException {
        if(connection==null)
        {
            String username = "root";
            String password = "        ";
            String url = "jdbc:mysql://localhost:3306/hr";
            connection  = DriverManager.getConnection(url,username,password);
        }
        return connection;
        
    }
    
}
