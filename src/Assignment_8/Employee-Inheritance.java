package Assignment_8;

// Inheritance Concept
// WageEmployee inheriting the properties of Employee class

class Employee {
    int hours;
    int rate;
    int salary;



    public Employee(int hours , int rate){
        this.hours = hours;
        this.rate = rate;
    }
    public void computeSalary(){
        salary = rate*hours;
        System.out.println("Salary of Employee is :: " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hours=" + hours +
                ", rate=" + rate +
                ", salary=" + salary +
                '}';
    }
}

class WageEmployee extends Employee{

    public WageEmployee(int hours, int rate){
       super(10,50);
       System.out.println(super.toString());
       super.computeSalary();
       this.hours = hours;
       this.rate = rate;
    }


    public void computeSalary(){


        System.out.println(toString());
        salary = rate*hours;
        System.out.println("Salary of Wage Employee is :: " + salary);
    }
}

// 2nd Que
class SalesPerson extends WageEmployee{

    int sales = 10;
    int comission = 100;
    public SalesPerson(int hours, int rate) {
        super(5, 1000);
        super.computeSalary();
    }

    @Override
    public void computeSalary() {
        hours = 10;
        rate = 700;
        salary = hours*rate + sales*comission;
        System.out.println(toString());
        System.out.println("Salary of Sales person is :: " + salary);

    }
}
// 3rd Question
class Manager extends Employee{

    int fixed_salary;
    int incentives;

    public Manager(){
        super(10 , 500);
        super.computeSalary();
    }
    public Manager(int fixed_salary , int incentives){
        this();
        this.fixed_salary = fixed_salary;
        this.incentives = incentives;
    }

    @Override
    public void computeSalary() {
        System.out.println("Salary of Manager is :: " + (fixed_salary + incentives));
    }
}

// 4th Que

class TestEmployee{


}

class EmployeeInheritance{
    public static void main(String[] args) {
       /* SalesPerson salesPerson = new SalesPerson(50 , 1000);
        salesPerson.computeSalary();

        Manager manager = new Manager(10000 , 5000);
        manager.computeSalary(); */

        //Question 4
        Employee[] employee = new Employee[3];
        employee[0] =  new Employee(10,500);
        employee[1] = new Employee(12,500);
        employee[2] = new Employee(14,500);

        for(int i = 0; i<3; i++){
            employee[i].computeSalary();
        }


    }
}