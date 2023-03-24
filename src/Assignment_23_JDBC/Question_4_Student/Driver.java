package Assignment_23_JDBC.Question_4_Student;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 :: Add Employee Details");
            System.out.println("Press 2 :: Show All Records");
            System.out.println("Press 3 :: Alter Table");
            System.out.println("Press 4 :: TY and % > 70");
            System.out.println("Press 5 :: ID between 1 and 10");
            System.out.println("Press 6 :: Batch Execute");

            int choice = input.nextInt();
            switch (choice){
                case 1 :
                    Assignment_23_JDBC.Question_4_Student.DAO.insertEmployee();
                    break;
                case 2 :
                    Assignment_23_JDBC.Question_4_Student.DAO.ShowAll();
                    break;
                case 3 :
                    Assignment_23_JDBC.Question_4_Student.DAO.alterColumn();
                case 4 :
                    Assignment_23_JDBC.Question_4_Student.DAO.fetchTY();
                    break;
                case 5 :
                    DAO.fetch10();
                    break;
                case 6:
                    DAO.BatchExecute();
                    break;
            }
        }


    }
}


/*
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
3
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Connection Established.....
Table altered successfully

Connection Established.....
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
1
Enter number of Student you want to add ....
2
Enter Name::
Tanmay
Enter Year ::
3
Enter percentage ::
99
Enter city ::
Pune
Enter gender ::
m
Connection Established.....
2 Students added successfully
Enter Name::
Aniket
Enter Year ::
4
Enter percentage ::
88
Enter city ::
Pune
Enter gender ::
m
Connection Established.....
2 Students added successfully
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
2
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 1
Name :: Tanmay
Year :: 3
Percentage :: 99
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 2
Name :: Aniket
Year :: 4
Percentage :: 88
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
6
Connection Established.....
Exception in Batch
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
2
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 1
Name :: Mr. Tanmay
Year :: 3
Percentage :: 99
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 2
Name :: Mr. Aniket
Year :: 4
Percentage :: 88
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 3
Name :: Mr. yash
Year :: 2
Percentage :: 88
City :: agra
Gender :: M
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 4
Name :: Ms. Krati
Year :: 2
Percentage :: 88
City :: agra
Gender :: F
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 5
Name :: Ms. Shreay
Year :: 3
Percentage :: 90
City :: MP
Gender :: F
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
4
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 1
Name :: Mr. Tanmay
Year :: 3
Percentage :: 99
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 5
Name :: Ms. Shreay
Year :: 3
Percentage :: 90
City :: MP
Gender :: F
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute
5
Connection Established.....
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 1
Name :: Mr. Tanmay
Year :: 3
Percentage :: 99
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 2
Name :: Mr. Aniket
Year :: 4
Percentage :: 88
City :: Pune
Gender :: m
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 3
Name :: Mr. yash
Year :: 2
Percentage :: 88
City :: agra
Gender :: M
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 4
Name :: Ms. Krati
Year :: 2
Percentage :: 88
City :: agra
Gender :: F
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ID :: 5
Name :: Ms. Shreay
Year :: 3
Percentage :: 90
City :: MP
Gender :: F
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Press 1 :: Add Employee Details
Press 2 :: Show All Records
Press 3 :: Alter Table
Press 4 :: TY and % > 70
Press 5 :: ID between 1 and 10
Press 6 :: Batch Execute

 */