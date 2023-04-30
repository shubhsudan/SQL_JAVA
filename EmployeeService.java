package sit.demo;

public class EmployeeService {
    public static void main(String[] args)
    {
        try(Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement())
    }
}
