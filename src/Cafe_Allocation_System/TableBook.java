package Cafe_Allocation_System;

import java.util.Scanner;

public class TableBook extends Thread {

    String name = "";
    static int numberOfSeats = 0;
    static int tableFor2 = 8;
    static int tableFor4 = 4;
    static int tableFor6 = 2;
    static int  tableFor8 = 2;

    static boolean isBooked = false;



    public void run(){
        System.out.println("---------------Availability of Tables--------------");
        System.out.println("---------------------------------------------------");
        System.out.println("| Maximum Occupancy  | Number of Tables Available |");
        System.out.println("---------------------------------------------------");
        System.out.println("| Max. Occupancy : 2 |"+"              " + tableFor2 + "             |");
        System.out.println("---------------------------------------------------");
        System.out.println("| Max. Occupancy : 4 |"+"              " + tableFor4 + "             |");
        System.out.println("---------------------------------------------------");
        System.out.println("| Max. Occupancy : 6 |"+"              " + tableFor6 + "             |");
        System.out.println("---------------------------------------------------");
        System.out.println("| Max. Occupancy : 8 |"+"              " + tableFor8 + "             |");
        System.out.println("---------------------------------------------------");
        System.out.println();

        System.out.println("Enter Your name :: ");
        Scanner input = new Scanner(System.in);
        name = input.next();
        System.out.println("Enter number of seats you required :: ");
        numberOfSeats = input.nextInt();


        if(numberOfSeats<=2){
            if(tableFor2!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor2--;
                isBooked = true;

            }else if(tableFor4!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor4--;
                isBooked = true;
            }else if(tableFor6!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor6--;
                isBooked = true;
            }else if(tableFor8!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor8--;
                isBooked = true;
            }else{
                System.out.println("No seats available :(");
            }
        }else if(numberOfSeats<=4){
            if(tableFor4!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor4--;
                isBooked = true;
            }else if(tableFor6!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor6--;
                isBooked = true;
            }else if(tableFor8!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor8--;
                isBooked = true;
            }else{
                System.out.println("No seats available :(");
            }
        }else if(numberOfSeats<=6){
            if(tableFor6!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor6--;
                isBooked = true;
            }else if(tableFor8!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor8--;
                isBooked = true;
            }else{
                System.out.println("No seats available :(");
            }
        }else if(numberOfSeats<=8){
            if(tableFor8!=0){
                System.out.println("Table for " + numberOfSeats + " has booked...");
                tableFor8--;
                isBooked = true;
            }else{
                System.out.println("No seats available :(");
            }
        }



    }

}




