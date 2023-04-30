package sit.demo;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductService {
    public static void main(String[] args) throws SQLException {
        String sql = "insert into products values(?,?,?,?)";
        try(Connection connection = DBUtil.getConnection();
        PreparedStatement pst = connection.prepareStatement(sql))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Product id");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter product title");
            String title = scanner.nextLine();
            System.out.println("Enter Product Price");
            float price = scanner.nextFloat();
            System.out.println("Enter Product Quantity");
            int quantity  = scanner.nextInt();
            pst.setInt(1,id);
            pst.setString(2,title);
            pst.setFloat(3,price);
            pst.setInt(4,quantity);
            int count  = pst.executeUpdate();

            pst.executeUpdate();


        }
    }

}

