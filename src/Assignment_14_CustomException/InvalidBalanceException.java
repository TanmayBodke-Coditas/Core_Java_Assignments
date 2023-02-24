package Assignment_14_CustomException;

public class InvalidBalanceException extends RuntimeException{
    InvalidBalanceException(String s){
        System.out.println(s + " this is greater than the balance amount");
    }
}
