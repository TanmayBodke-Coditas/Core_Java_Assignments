package Assignment_23_JDBC.Question_4_Student;

import Assignment_23_JDBC.ConnectionProvider;
import Assignment_23_JDBC.Question_3_Employee.Employee;

import java.sql.*;
import java.util.Scanner;

public class DAO {
    public static void insertEmployee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Student you want to add ....");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            //String name, int year, int percentage, String city, String gender

            System.out.println("Enter Name::");
            String name = input.next();
            //input.nextLine();
            System.out.println("Enter Year ::");
            int year = input.nextInt();

            System.out.println("Enter percentage ::");
            int percentage = input.nextInt();


            System.out.println("Enter city :: ");
            String city = input.next();
            System.out.println("Enter gender :: ");
            String gender = input.next();


            Student student = new Student(name, year, percentage, city, gender);


            try {
                //name, year, percentage,city,gender

                Connection connection = ConnectionProvider.createConnection();
                String query = "insert into student_details(name , year, percentage, city, gender) values(?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, student.name);
                preparedStatement.setInt(2, student.year);
                preparedStatement.setInt(3, student.percentage);
                preparedStatement.setString(4, student.city);
                preparedStatement.setString(5, student.gender);
                preparedStatement.executeUpdate();
                System.out.println(n + " Students added successfully");


            } catch (Exception e) {
                System.out.println("Exception in insertion");
            }

        }
    }

    public static void ShowAll() {
        try {
            //name, year, percentage,city,gender

            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from student_details";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("ID :: " + resultSet.getInt(1));
                System.out.println("Name :: " + resultSet.getString(2));
                System.out.println("Year :: " + resultSet.getInt(3));
                System.out.println("Percentage :: " + resultSet.getInt(4));
                System.out.println("City :: " + resultSet.getString(5));
                System.out.println("Gender :: " + resultSet.getString(6));
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        } catch (Exception e) {
            System.out.println("Exception in Show");
        }
    }

    static boolean flag = false;

    public static void alterColumn() {

        try {

            if (flag == false) {
                Connection connection = ConnectionProvider.createConnection();
                String query = "alter table student_details add column gender varchar(20)";
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


    public static void fetchTY() {
        try {
            //name, year, percentage,city,gender

            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from student_details where year =3 AND percentage > 70";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("ID :: " + resultSet.getInt(1));
                System.out.println("Name :: " + resultSet.getString(2));
                System.out.println("Year :: " + resultSet.getInt(3));
                System.out.println("Percentage :: " + resultSet.getInt(4));
                System.out.println("City :: " + resultSet.getString(5));
                System.out.println("Gender :: " + resultSet.getString(6));
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        } catch (Exception e) {
            System.out.println("Exception in FetchTY");
        }
    }

    public static void fetch10() {
        try {
            //name, year, percentage,city,gender

            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from student_details where id BETWEEN 1 and 10";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("ID :: " + resultSet.getInt(1));
                System.out.println("Name :: " + resultSet.getString(2));
                System.out.println("Year :: " + resultSet.getInt(3));
                System.out.println("Percentage :: " + resultSet.getInt(4));
                System.out.println("City :: " + resultSet.getString(5));
                System.out.println("Gender :: " + resultSet.getString(6));
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        } catch (Exception e) {
            System.out.println("Exception in Fetch10");
        }
    }

    public static void BatchExecute() {
        try {
            //name, year, percentage,city,gender

            Connection connection = ConnectionProvider.createConnection();

            Statement statement = connection.createStatement();
            statement.addBatch("insert into student_details(name , year, percentage, city, gender) values('yash',2, 88, 'agra', 'M' )");
            statement.addBatch("insert into student_details(name , year, percentage, city, gender) values('Krati',2, 88, 'agra', 'F' )");
            statement.addBatch("insert into student_details(name , year, percentage, city, gender) values('Shreay',3, 90, 'MP', 'F' )");
            statement.addBatch("update student_details set name = concat('Mr. ', name) where gender = 'm'");
            statement.addBatch("update student_details set name = concat('Ms. ', name) where gender = 'f'");
            statement.addBatch("delete student_details where year = 4");
            statement.executeBatch();
        } catch (Exception e) {
            System.out.println("Exception in Batch");
        }
    }
}
