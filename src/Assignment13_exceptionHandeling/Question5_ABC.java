package Assignment13_exceptionHandeling;

public class Question5_ABC {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
        } catch (Exception e) {
            System.out.println("Please give correct condition for length");
        }
    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at Assignment13_exceptionHandeling.Question5_ABC.main(Question5_ABC.java:17)

Please give correct condition for length

 */