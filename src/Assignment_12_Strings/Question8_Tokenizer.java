package Assignment_12_Strings;
import java.util.*;
class Tokenizer {
    public void display() {
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("3+20%2*20/2", "[+%-/*]", true);
        int i = 0;
        while (str.hasMoreTokens()) {
            if (i % 2 == 0) {
                operands.add(str.nextToken());
            } else {
                operators.add(str.nextToken());
            }
            i++;
        }
        System.out.println(operators);
        System.out.println(operands);
    }
}
public class Question8_Tokenizer {
    public static void main(String[] args) {

        Tokenizer tokenizer = new Tokenizer();
        System.out.println("-------------OUTPUT OF QUE8--------------");
        tokenizer.display();
    }
}

/*
-------------OUTPUT OF QUE8--------------
[+, %, *, /]
[3, 20, 2, 20, 2]

 */