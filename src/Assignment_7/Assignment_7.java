package Assignment_7;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class Question1{

    // Array package  : https://docs.oracle.com/javase/9/docs/api/java/util/Arrays.html
    int [] simpleArr = {7, 6, 9, 0, 1, 10, 2};
    void sort(){
        Arrays.sort(simpleArr);
        System.out.print("Sorted Array is :: ");
        for (int arrElement: simpleArr) {            //ForEach Loop
            System.out.print(arrElement + " ");
        }

    }
}

class Question2{
    Integer [] array = {7, 6, 9, 0, 1, 10, 2};
    void showAscAndDesc(){
        Arrays.sort(array);
        System.out.print("Ascending Array is :: ");
        for (int asc: array) {
            System.out.print(asc + " ");
        }
        System.out.println();
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print("Descending Array is :: ");
        for (int desc: array) {
            System.out.print(desc + " ");
        }
    }
}


class Question3{
    int [] array = {7, 6, 9, 0, 1, 10, 2};
    void displayCopiedArray(){
        int[] copiedArray = Arrays.copyOf(array, array.length);
        System.out.print("Copied Array is :: ");
        for (int element: copiedArray) {
            System.out.print(element + " ");
        }
    }
}

class Question4{
    int [] array = {1,2,3,3,4,5,6};
    int duplicate;

    public void showDuplicate(){
        for(int i = 1; i<array.length; i++){
            if(array[i]==array[i-1]){
                duplicate = array[i];
                System.out.println("Duplicate element is :: " + duplicate );
            }
        }
    }

    public void removeDuplicate(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<array.length; i++){
            if(array[i]==array[i-1]){
                continue;
            }
            numbers.add(array[i-1]);
        }

        System.out.print("New array without duplicates is :: ");
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }

}

class Question5{
    int[][] array1 = {{1,2,3}, {4,5,6,7}, {8,9}};
    int[][] array2 = {{10,11,12}, {13,14,15,16}, {17,18}};

    int result = 0;
    void add(){
        for(int i = 0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                result = array1[i][j] + array2[i][j];
                System.out.println("Addition of Array[" + i + "][" + j + "] is :: " + result);
            }
        }
    }
}

class Question6{
    int [] array = {1,2,3,3,4,5,6};
    public void showNthElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number less than " + (array.length -1) + ":: ");
        int index = input.nextInt();
        System.out.println("Your output is :: " + array[index]);
    }

}

class AreaOfRectangle{
    private int length;
    private int breadth;
    private int result;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getResult() {
        return this.getLength()*this.getBreadth();
    }
}
public class Assignment_7 {
    public static void main(String[] args) {
        System.out.println("----------OUTPUT OF QUE1------------") ;
        Question1 question1 = new Question1();
        question1.sort();

        System.out.println("----------OUTPUT OF QUE2------------") ;
        Question2 question2 = new Question2();
        question2.showAscAndDesc();

        System.out.println("----------OUTPUT OF QUE3------------") ;
        Question3 question3 = new Question3();
        question3.displayCopiedArray();

        System.out.println("----------OUTPUT OF QUE4------------") ;
        Question4 question4 = new Question4();
        question4.showDuplicate();
        question4.removeDuplicate();


        System.out.println("----------OUTPUT OF QUE5------------") ;
        Question5 question5 = new Question5();
        question5.add();

        System.out.println("----------OUTPUT OF QUE6------------") ;
        Question6 question6 = new Question6();
        question6.showNthElement();


    }
}


/*-------------------------------OUTPUTS------------------------------------------
----------OUTPUT OF QUE1------------
Sorted Array is :: 0 1 2 6 7 9 10


----------OUTPUT OF QUE2------------
Ascending Array is :: 0 1 2 6 7 9 10
Descending Array is :: 10 9 7 6 2 1 0


----------OUTPUT OF QUE3------------
Copied Array is :: 7 6 9 0 1 10 2


----------OUTPUT OF QUE4------------
Duplicate element is :: 3
New array without duplicates is :: 1 2 3 4 5



----------OUTPUT OF QUE5------------
Addition of Array[0][0] is :: 11
Addition of Array[0][1] is :: 13
Addition of Array[0][2] is :: 15
Addition of Array[1][0] is :: 17
Addition of Array[1][1] is :: 19
Addition of Array[1][2] is :: 21
Addition of Array[1][3] is :: 23
Addition of Array[2][0] is :: 25
Addition of Array[2][1] is :: 27


----------OUTPUT OF QUE6------------
Enter a number less than 6:: 4
Your output is :: 4



 */