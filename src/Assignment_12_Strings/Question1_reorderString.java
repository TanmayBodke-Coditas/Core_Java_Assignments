package Assignment_12_Strings;
import java.util.*;
import java.lang.String;
class Reorder{
    public void display(){
        String[] strArray = {"Hiiiiiii" , "Hii" , "Helooooooo"};



        Arrays.sort(strArray, Comparator.comparingInt(String::length));

        for (String s : strArray) {
            System.out.println(s);
        }




    }
}
public class Question1_reorderString {
    public static void main(String[] args) {
        Reorder reorder = new Reorder();
        System.out.println("-----------------------OUTPUT OF QUE1----------------------------");
        reorder.display();
    }
}
/*
-----------------------OUTPUT OF QUE1----------------------------
Hii
Hiiiiiii
Helooooooo
 */