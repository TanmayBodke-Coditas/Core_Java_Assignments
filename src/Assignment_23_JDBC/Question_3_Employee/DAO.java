package Assignment_23_JDBC.Question_3_Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DAO {
    public static void insertEmployee() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Employee you want to add ....");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {


            System.out.println("Enter Name::");
            String name = input.next();
            //input.nextLine();
            System.out.println("Enter Designation ::");
            String designation = input.next();

            System.out.println("Enter Date of Joining in YYYY-MM-DD format ::");
            String date = input.next();

            System.out.println("Enter experience in year");
            int experience = input.nextInt();
            System.out.println("Enter Status :: ");
            String status = input.next();
            System.out.println("Enter city :: ");
            String city = input.next();
            System.out.println("Enter Salary ::");
            int salary = input.nextInt();


            Employee employee = new Employee(name, designation, date, experience, salary, status, city);

            try {
                //id int primary key auto_increment, name varchar(50), designation varchar(20),
                // doj date, experience int, salary int, status varchar(20)

                Connection connection = ConnectionProvider.createConnection();
                String query = "insert into emp_details(name , designation, doj, experience, salary, status, city) values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, employee.name);
                preparedStatement.setString(2, employee.designation);
                preparedStatement.setString(3, employee.date);
                preparedStatement.setInt(4, employee.experience);
                preparedStatement.setInt(5, employee.salary);
                preparedStatement.setString(6, employee.status);
                preparedStatement.setString(7, employee.city);

                preparedStatement.executeUpdate();
                System.out.println(n + " Employees added successfully");


            } catch (Exception e) {
                System.out.println("Exception in insertion");
            }

        }
    }

    public static void ShowAll() {
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from emp_details";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //name , designation, doj, experience, salary, status
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("ID ::" + resultSet.getInt(1));
                System.out.println("Name ::" + resultSet.getString(2));
                System.out.println("Destination :: " + resultSet.getString(3));
                System.out.println("Date of  Joining ::" + resultSet.getString(4));
                System.out.println("Experience :: " + resultSet.getInt(5));
                System.out.println("Salary :: " + resultSet.getInt(6));
                System.out.println("Status :: " + resultSet.getString(7));
                System.out.println("City :: " + resultSet.getString(8));
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }

        } catch (Exception e) {
            System.out.println("Exception in showAll");
        }
    }

    static boolean flag = false;

    public static void alterColumn() {

        try {

            if (flag == false) {
                Connection connection = ConnectionProvider.createConnection();
                String query = "alter table emp_details add column city varchar(20)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.executeUpdate();
                System.out.println("Table altered successfully");
                System.out.println();
                flag = true;
            } else {
                System.out.println("Already altered!!!");
            }
        } catch (Exception e) {
            System.out.println("Exception in Alter");
        }
    }

    public static void fromPune() {
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from emp_details where city='pune' AND salary >20000";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //name , designation, doj, experience, salary, status
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("ID ::" + resultSet.getInt(1));
                System.out.println("Name ::" + resultSet.getString(2));
                System.out.println("Destination :: " + resultSet.getString(3));
                System.out.println("Date of  Joining ::" + resultSet.getString(4));
                System.out.println("Experience :: " + resultSet.getInt(5));
                System.out.println("Salary :: " + resultSet.getInt(6));
                System.out.println("Status :: " + resultSet.getString(7));
                System.out.println("City :: " + resultSet.getString(8));
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }

        } catch (Exception e) {
            System.out.println("Exception in FromPune");
        }


    }
    public static void Update() {
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "UPDATE emp_details SET salary = salary+1000 where experience > 3";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception in Update");
        }
    }

}
