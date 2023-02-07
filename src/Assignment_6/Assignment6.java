package Assignment_6;

import java.time.LocalDate;
import java.util.Scanner;

class Question1 {
// Question 1 Ans : It will print "Second" and "Third"
}
class Question2{
    int number1 = 3;
    void display(){
        if(number1>=0) {
            if (number1 == 0) {
                System.out.println("First");
            }else {
                System.out.println("Second");
            }
        }
        System.out.println("Third");
    }
}

class Question3{

    public void displayTemp(){
        int var = 3;

        switch (var){
            case 1 :
                System.out.println("Low");
                break;
            case 2 :
                System.out.println("Medium");
                break;
            case 3 :
                System.out.println("High");
                break;
            default:
                System.out.println("Abnormal");
        }
    }

}

class Question4{
    int m =2 , x = 0;
    public void display(){
        if(m==0){
            x = x + 2;
            System.out.println("X=" + x);
        } else if (m==1) {
            x = x + 4;
            System.out.println("X=" + x);
        }else if (m==2) {
            x = x + 6;
            System.out.println("X=" + x);
        }
    }
}

class Question5{
    public void DisplayGreater() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1st :: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2nd :: ");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("Greater number is :: " + num1);
        }else{
            System.out.println("Greater number is :: " + num2);
        }

    }
}

class Question6{
    public void DetermineAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age of Person 1:: ");
        int person1Age = input.nextInt();
        System.out.println("Enter Age of Person 2:: ");
        int person2Age = input.nextInt();
        System.out.println("Enter Age of Person 3:: ");
        int person3Age = input.nextInt();

        if(person1Age > person2Age && person1Age > person3Age){
            System.out.println("Person 1 is oldest between all persons ");
        } else if (person2Age > person3Age && person2Age > person1Age) {
            System.out.println("Person 1 is oldest between all persons ");
        } else {
            System.out.println("Person 3 is oldest between all persons ");
        }

        if(person1Age < person2Age && person1Age < person3Age){
            System.out.println("Person 1 is youngest between all persons ");
        }else if (person2Age < person3Age && person2Age < person1Age) {
            System.out.println("Person 2 is youngest between all persons ");
        } else {
            System.out.println("Person 3 is youngest between all persons ");
        }
    }
}

class Question7_1{
    public void jump(){
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(int i = 0; i< days.length; i++){
            if(days[i]=="Thursday"){
                continue;
            }
            System.out.println(days[i]);
        }
    }
}

class Question7_2{
    public void jump(){
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        LocalDate today = LocalDate.now();
        String day =  today.getDayOfWeek().toString().toLowerCase();
        for(int i = 0; i< days.length; i++){
            if(days[i].toLowerCase().equals(day)){
                continue;
            }
            System.out.println(days[i]);
        }
    }
}

class Question7_3{
    public void getDate(){
        LocalDate today = LocalDate.now();
        int date = today.getDayOfMonth();

        for(int i =1 ; i<=date; i++){
            System.out.println(i);
        }
    }
}

class Question8_1_1{
    public void displayPattern(){
        for(int i = 0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Question8_1_2{
    public void displayPattern(){
        char letters[] = {'A', 'B', 'C', 'D', 'E', 'F'};

        for(int i=0; i< letters.length; i++){
            for(int j=0; j< letters.length - i; j++){
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i< letters.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }
    }
}

class Question8_2_1{
    public void printPattern(){
        for(int i =0; i<6; i++){
            for(int j=0; j<=9-i; j++){
                if(j<=i){
                    System.out.print("  ");
                }else{
                        System.out.print("* ");
                    }
                }
            System.out.println();
        }

    }
}

class Question8_2_2{
    void printPattern() {
        char letters[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letters.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < letters.length; i++){
            for(int j=0; j<letters.length - i -1; j++){
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }
    }
}

class Question8_3_1{
    void printPattern(){
        for(int i =0; i<=5; i++){
            for(int j=0; j<=4-i; j++){
                System.out.print("  ");
            }
            for(int k =0; k<i*2-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i =0; i<5; i++){
            for(int j=0; j<8-i; j++){
                if(j<=i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

class Question8_3_2{
    public void printPattern() {


        for (int i = 1; i<=6; i++) {
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            ch--;
            for(int k=2;k<=i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
public class Assignment6 {
    public static void main(String[] args) {
        System.out.println("----------OUTPUT OF QUE2------------") ;
        Question2 question2 = new Question2();
        question2.display();

        System.out.println("----------OUTPUT OF QUE3------------");
        Question3 question3 = new Question3();
        question3.displayTemp();

        System.out.println("----------OUTPUT OF QUE4------------");
        Question4 question4 = new Question4();
        question4.display();

        System.out.println("----------OUTPUT OF QUE5------------");
        Question5 question5 = new Question5();
        question5.DisplayGreater();

        System.out.println("----------OUTPUT OF QUE6------------");
        Question6 question6 = new Question6();
        question6.DetermineAge();

        System.out.println("----------OUTPUT OF QUE7_1------------");
        Question7_1 question7_1 = new Question7_1();
        question7_1.jump();

        System.out.println("----------OUTPUT OF QUE7_2------------");
        Question7_2 question7_2 = new Question7_2();
        question7_2.jump();

        System.out.println("----------OUTPUT OF QUE7_3------------");
        Question7_3 question7_3 = new Question7_3();
        question7_3.getDate();

        System.out.println("----------OUTPUT OF QUE8_1_1------------");
        Question8_1_1 question8_1_1 = new Question8_1_1();
        question8_1_1.displayPattern();

        System.out.println("----------OUTPUT OF QUE8_1_2------------");
        Question8_1_2 question8_1_2 = new Question8_1_2();
        question8_1_2.displayPattern();

        System.out.println("----------OUTPUT OF QUE8_2_1------------");
        Question8_2_1 question8_2_1 = new Question8_2_1();
        question8_2_1.printPattern();

        System.out.println("----------OUTPUT OF QUE8_2_2------------");
        Question8_2_2 question8_2_2 = new Question8_2_2();
        question8_2_2.printPattern();

        System.out.println("----------OUTPUT OF QUE8_3_1------------");
        Question8_3_1 question8_3_1 = new Question8_3_1();
        question8_3_1.printPattern();

        System.out.println("----------OUTPUT OF QUE8_3_2------------");
        Question8_3_2 question8_3_2 = new Question8_3_2();
        question8_3_2.printPattern();
    }
}


/*---------------------------OUTPUTS---------------------------------------------

----------OUTPUT OF QUE2------------
Second
Third


----------OUTPUT OF QUE3------------
High


----------OUTPUT OF QUE4------------
X=6


----------OUTPUT OF QUE5------------
Enter Number 1st ::
10
Enter Number 2nd ::
20
Greater number is :: 20


----------OUTPUT OF QUE6------------
Enter Age of Person 1::
10
Enter Age of Person 2::
11
Enter Age of Person 3::
12
Person 3 is oldest between all persons
Person 1 is youngest between all persons


----------OUTPUT OF QUE7_1------------
Monday
Tuesday
Wednesday
Friday
Saturday
Sunday


----------OUTPUT OF QUE7_2------------
Monday
Wednesday
Thursday
Friday
Saturday
Sunday



----------OUTPUT OF QUE7_3------------
1
2
3
4
5
6
7


----------OUTPUT OF QUE8_1_1------------
*
**
***
****
*****


----------OUTPUT OF QUE8_1_2------------
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F



----------OUTPUT OF QUE8_2_1------------
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *



----------OUTPUT OF QUE8_2_2------------
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E
A B C D
A B C
A B
A


----------OUTPUT OF QUE8_3_1------------

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *


----------OUTPUT OF QUE8_3_2------------
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
ABCDEFEDCBA



 */