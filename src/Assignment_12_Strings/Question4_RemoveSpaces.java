package Assignment_12_Strings;
import java.lang.String;
class RemoveSpace{
    public void remove(){
        String str = "   How are You????????        ";
        System.out.println("String without spaces :: " + str.trim());

    }
}
public class Question4_RemoveSpaces {
    public static void main(String[] args) {
        RemoveSpace removeSpace = new RemoveSpace();
        System.out.println("----------OUTPUT OF QUE4---------------");
        removeSpace.remove();
    }
}

/*
----------OUTPUT OF QUE4---------------
String without spaces :: How are You????????
 */
