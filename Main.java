package sit.demo;

import java.util.*;
import java.sql.*;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {


        String sql = "select department_id, department_name from departments";
        Connection connection = null;

        connection = DBUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next())
        {
            //System.out.println(resultSet.getString("country_name"));
            System.out.print(resultSet.getInt("department_id") + " ==>");
            System.out.println(resultSet.getString("department_name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println(connection);

    }
}