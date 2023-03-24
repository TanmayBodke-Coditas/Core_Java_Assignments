package Assignment_23_JDBC.Question_3_Employee;

import java.time.LocalDate;

public class Employee {

    //(id int primary key auto_increment, name varchar(50),
    // designation varchar(20), doj date, experience int, salary int, status varchar(20)
    int id;
    String name;
    String designation;
    String date;

    int experience;
    int salary;
    String status;

    String city;

    public Employee(String name, String designation, String date, int experience, int salary, String status, String city) {
        this.name = name;
        this.designation = designation;
        this.date = date;
        this.experience = experience;
        this.salary = salary;
        this.status = status;
        this.city = city;
    }

}
