package Cafe_Allocation_System;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("------------------------Welcome to the Cafe------------------------");

        while(true){
            TableBook customer1 = new TableBook();
            PrintMenu printMenu = new PrintMenu();
            SelectMenu selectMenu = new SelectMenu();
            System.out.println();
            System.out.println();
            System.out.println("Enter 0 : Exit");
            System.out.println("Enter 1 : Book Table");
            System.out.println("Enter 2 : Print Menu");
            System.out.println("Enter 3 : Order coffee");
            System.out.println();
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            switch (menu){
                case 0 :
                    break;
                case 1:
                    customer1.start();
                    customer1.join();
                    break;
                case 2 :
                    printMenu.start();
                    printMenu.join();
                    break;
                case 3:
                    if(customer1.isBooked==false){

                        try {
                            throw new NoReservationFoundException();
                        } catch (NoReservationFoundException e) {
                            System.out.println("NoReservationFoundException");
                        }
                    }else {
                        selectMenu.run();
                        selectMenu.join();
                        customer1.isBooked = true;
                    }
                    break;
            }
        }
    }
}


/*
------------------------Welcome to the Cafe------------------------


Enter 0 : Exit
Enter 1 : Book Table
Enter 2 : Print Menu
Enter 3 : Order coffee

1
Enter Your name ::
Tanmay
Enter number of seats you required ::
3
Table for 3 has booked...


Enter 0 : Exit
Enter 1 : Book Table
Enter 2 : Print Menu
Enter 3 : Order coffee

2
------MENU-------

Pizza - 10.99
Burger - 5.99
Coffee - 7.99
----------------


Enter 0 : Exit
Enter 1 : Book Table
Enter 2 : Print Menu
Enter 3 : Order coffee

3
Please select an item from the menu (type -1 to stop): 3
Enter the quantity: 3
Please select an item from the menu (type -1 to stop): 2
Enter the quantity: 3
Please select an item from the menu (type -1 to stop): -1

--------------BILL OF YOUR ORDER--------------
Bill No :: 22
You have selected the following items:
Coffee x 3 - 23.97
Burger x 3 - 17.97
Total: 41.94


Enter 0 : Exit
Enter 1 : Book Table
Enter 2 : Print Menu
Enter 3 : Order coffee


 */