package Assignment_23_JDBC.Question_3_Employee;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        DAO dao = new DAO();

        Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Press 1 :: Add Employee Details");
        System.out.println("Press 2 :: Show All Records");
        System.out.println("Press 3 :: Alter Table");
        System.out.println("Press 4 :: From Pune and salary > 20000");
        System.out.println("Press 5 :: Update salary");

        int choice = input.nextInt();
        switch (choice){
            case 1 :
                DAO.insertEmployee();
                break;
            case 2 :
                DAO.ShowAll();
                break;
            case 3 :
                DAO.alterColumn();
                break;
            case 4 :
                DAO.fromPune();
                break;
            case 5 :
                DAO.Update();
                break;
        }
    }


    }
}


/*
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
3
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Connection Established.....
Table altered successfully

Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
1
Enter number of Employee you want to add ....
3
Enter Name::
Tanmay
Enter Designation ::
Intern
Enter Date of Joining in YYYY-MM-DD format ::
2023-01-17
Enter experience in year
4
Enter Status ::
Working
Enter city ::
Pune
Enter Salary ::
20000
Connection Established.....
3 Employees added successfully
Enter Name::
Yash
Enter Designation ::
Intern
Enter Date of Joining in YYYY-MM-DD format ::
2002-12-31
Enter experience in year
2
Enter Status ::
Left
Enter city ::
Agra
Enter Salary ::
30000
Connection Established.....
3 Employees added successfully
Enter Name::
Bala
Enter Designation ::
Intern
Enter Date of Joining in YYYY-MM-DD format ::
2004-03-12
Enter experience in year
7
Enter Status ::
Working
Enter city ::
Chennai
Enter Salary ::
3000
Connection Established.....
3 Employees added successfully
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
2
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::3
Name ::Tanmay
Destination :: Intern
Date of  Joining ::2023-01-17
Experience :: 1
Salary :: 11000
Status :: Working
City :: null
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::4
Name ::Aniket
Destination :: Intern
Date of  Joining ::2023-01-17
Experience :: 1
Salary :: 10000
Status :: Working
City :: null
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::5
Name ::Tanmay
Destination :: Intern
Date of  Joining ::2023-01-17
Experience :: 4
Salary :: 20000
Status :: Working
City :: Pune
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::6
Name ::Yash
Destination :: Intern
Date of  Joining ::2002-12-31
Experience :: 2
Salary :: 30000
Status :: Left
City :: Agra
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::7
Name ::Bala
Destination :: Intern
Date of  Joining ::2004-03-12
Experience :: 7
Salary :: 3000
Status :: Working
City :: Chennai
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
3
Already altered!!!
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
4
Connection Established.....
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
5
Connection Established.....
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
1
Enter number of Employee you want to add ....
1
Enter Name::
Aniket
Enter Designation ::
Intern
Enter Date of Joining in YYYY-MM-DD format ::
2001-04-23
Enter experience in year
7
Enter Status ::
Working
Enter city ::
pune
Enter Salary ::
40000
Connection Established.....
1 Employees added successfully
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary
4
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::5
Name ::Tanmay
Destination :: Intern
Date of  Joining ::2023-01-17
Experience :: 4
Salary :: 21000
Status :: Working
City :: Pune
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID ::8
Name ::Aniket
Destination :: Intern
Date of  Joining ::2001-04-23
Experience :: 7
Salary :: 40000
Status :: Working
City :: pune
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: From Pune and salary > 20000
Press 5 :: Update salary

 */