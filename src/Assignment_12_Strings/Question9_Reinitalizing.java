package Assignment_12_Strings;

class Employee{
    int id = 9;
    String name = "Tanmay";
    String address = "Pune";
    int salary = 1000000;

    Employee(int id, String name , String address, int salary){
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Question9_Reinitalizing {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Xyz" , "Mumbai", 100 );
        System.out.println("------------OUTPUT OF QUE9--------------------");
        System.out.println(employee.toString());
    }

}
/*
------------OUTPUT OF QUE9--------------------
Employee{id=1, name='Xyz', address='Mumbai', salary=100}
 */