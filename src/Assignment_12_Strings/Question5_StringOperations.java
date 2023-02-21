package Assignment_12_Strings;
import java.util.*;

class StringOps {

    public void display() {
        Scanner s = new Scanner(System.in);
        String[] array = new String[5];

        System.out.println("Enter 5 Strings :: ");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter String " + (i + 1) + " :: ");
            array[i] = s1.nextLine();

        }

        Arrays.sort(array, Comparator.comparingInt(String::length));

        System.out.println("String in Ascending order is :: ");
        for (String str : array) {
            System.out.println(str);
        }
        String temp = "";
        String[] newArray = new String[5];
        System.out.println("Strings with replacement :: ");
        for (int i = 0; i < 5; i++) {
            String str = "";
            for (int j = 0; j < array[i].length(); j++) {
                char ch = array[i].charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ch++;
                }
                str += ch;
            }
            newArray[i] = str;
        }


        System.out.println("New String :: ");
        for (String str : newArray) {
            System.out.println(str);
        }
    }
}




public class Question5_StringOperations {
    public static void main(String[] args) {
            StringOps stringOps = new StringOps();
        System.out.println("------------------OUTPUT OF QUE5--------------------");
            stringOps.display();
    }
}

/*
------------------OUTPUT OF QUE5--------------------
Enter 5 Strings ::
Enter String 1 ::
Tanmay
Enter String 2 ::
Yash
Enter String 3 ::
Aniket
Enter String 4 ::
Aryaman
Enter String 5 ::
Bala
String in Ascending order is ::
Yash
Bala
Tanmay
Aniket
Aryaman
Strings with replacement ::
New String ::
Ybsh
Bblb
Tbnmby
Anjkft
Arybmbn

Process finished with exit code 0

 */