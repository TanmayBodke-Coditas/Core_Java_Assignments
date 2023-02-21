package Assignment_12_Strings;

class Count{
    public void dispalyCount(){
        String name= "Tanmay";
        int vowel = 0;
        int consonent = 0;
        for (int i = 0 ; i< name.length(); i++){
            char c = name.charAt(i);
            if(c == 'a' || c=='e' || c=='i' || c=='o'|| c=='u'){
                vowel++;
            }else{
                consonent++;
            }
        }
        System.out.println("Vowel Count is :: " + vowel);
        System.out.println("Consonent Count is :: " + consonent);
    }
}
public class Question2_Count {
    public static void main(String[] args) {
        Count count = new Count();
        System.out.println("-------------------OUTPUT OF QUE2-----------------------");
        count.dispalyCount();

    }
}

/*
-------------------OUTPUT OF QUE2-----------------------
Vowel Count is :: 2
Consonent Count is :: 4

 */