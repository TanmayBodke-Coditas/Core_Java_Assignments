package Assignment_23_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static Connection connection;
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Coditas@23");
            System.out.println("Connection Established.....");
        }catch (Exception e){
            System.out.println("Exception");
        }

        return connection;
    }
}
