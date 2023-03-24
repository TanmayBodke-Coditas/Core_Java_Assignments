package Assignment_23_JDBC.Question_4_Student;

public class Student {
    //id name year percent city

    int id;
    String name;
    int year;
    int percentage;
    String city;

    String gender;

    public Student(String name, int year, int percentage, String city, String gender) {
        this.name = name;
        this.year = year;
        this.percentage = percentage;
        this.city = city;
        this.gender = gender;
    }
}
