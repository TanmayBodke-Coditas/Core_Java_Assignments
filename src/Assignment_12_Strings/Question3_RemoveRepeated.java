package Assignment_12_Strings;

import java.rmi.Remote;
import java.util.ArrayList;

class Repeated{
    public void remove(){
        String name = "Tanmay";
        String result = "";
        ArrayList <Character> temp = new ArrayList<>();

        for(int i =0; i<name.length(); i++){
            if(temp.contains(name.charAt(i))){
                continue;
            }else{
               temp.add(name.charAt(i));
            }
        }

        for (int i = 0; i<temp.size(); i++){
            result = result + temp.get(i);
        }
        System.out.println("Final String is :: " + result);
    }
}
public class Question3_RemoveRepeated {
    public static void main(String[] args) {
        Repeated repeated = new Repeated();
        System.out.println("--------------------OUTPUT OF QUE3-------------------s");
        repeated.remove();
    }
}

/*
--------------------OUTPUT OF QUE3-------------------s
Final String is :: Tanmy
 */