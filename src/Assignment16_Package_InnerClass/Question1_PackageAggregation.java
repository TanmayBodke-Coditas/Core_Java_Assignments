package Assignment16_Package_InnerClass;

import Assignment16_Package_InnerClass.Package2.Employee;


public class Question1_PackageAggregation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Tanmay";

    }
}


/*
import Assignment16_Package_InnerClass.Package1.Address;

we need to import package and respective class if we are using aggregation in different class.

and need to use public modifiers
 */