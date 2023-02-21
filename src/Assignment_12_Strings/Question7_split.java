package Assignment_12_Strings;

public class Question7_split {
    public static void main(String[] args) {
        String str = "Hi,all.How are you?";
        String arr[]=str.split("[ .,_]");
        for (String strr: arr
             ) {
            System.out.println(strr);
        }
    }
}

/*
Hi
all
How
are
you?

Process finished with exit code 0

 */