package Cafe_Allocation_System;

public class InvalidOrderException extends Exception{
    InvalidOrderException(){
        System.out.println("Coffee is mandatory to place the order...");
    }
}
