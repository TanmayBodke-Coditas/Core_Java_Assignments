package Assignment_14_CustomException;

public class Transaction {

        int balance = 1000;
        public void Validate(int amount){
            if(amount<=0){
                try{
                    throw new InvalidAmountException(Integer.toString(amount));
                }catch (RuntimeException e){
                    System.out.println();
                }
            }

            if(balance<amount){
                try{
                    throw new InvalidBalanceException(Integer.toString(amount));
                }catch(RuntimeException e){
                    System.out.println();
                }
            }
        }
}
