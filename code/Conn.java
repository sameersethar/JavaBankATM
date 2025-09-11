import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    Conn(){
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","admin");
            statement=connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
