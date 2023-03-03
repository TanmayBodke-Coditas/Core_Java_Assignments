package Cafe_Allocation_System;

public class NoReservationFoundException extends Exception{
        NoReservationFoundException(){
            System.out.println("Please Book Table first :)");
        }
}
