package Assignment_14_CustomException;

public class InvalidAmountException extends RuntimeException{
        InvalidAmountException(String s){
            System.out.println(s + " is not a valid amount, please enter valid amount...." );
        }
}

