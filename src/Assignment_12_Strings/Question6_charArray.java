package Assignment_12_Strings;

public class Question6_charArray {
    public static void main(String[] args) {
        String name = "tanmay";
        char[] array = name.toCharArray();

        System.out.println("---------------OUTPUT OF QUE6---------------");

        for(int i =0; i<array.length ; i++){
            System.out.println(array[i]);
        }

    }
}

/*
---------------OUTPUT OF QUE6---------------
t
a
n
m
a
y

Process finished with exit code 0

 */