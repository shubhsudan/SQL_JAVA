package sit.demo;

import java.sql.*;

public class country_name { public static void main(String[] args) throws SQLException {

    String username ="root";
    String password = "        ";
    String url = "jdbc:mysql://localhost:3306/hr";
    String sql = "select country_name from countries";
    Connection connection = null;

    connection = sit.demo.DBUtil.getConnection();  //DriverManager
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    while(resultSet.next())
    {
        System.out.println(resultSet.getString("country_name"));
        //System.out.print(resultSet.getInt("department_id") + " ==>");
        // System.out.println(resultSet.getString("department_name"));
    }
    resultSet.close();
    statement.close();
    connection.close();
    System.out.println(connection);

}
}
