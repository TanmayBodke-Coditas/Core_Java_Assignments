package Assignment_10_Polymorphism;

class Addition{
    void add(int a,int b){
        System.out.print("Addition of 2 numbers : ");
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.print("Addition of 3 numbers : ");
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d){
        System.out.print("Addition of 4 numbers : ");
        System.out.println(a+b+c+d);
    }
}
class VarargsAddition{
    public void sum(int ...arr){
        int result =0;
        for(int a: arr){
            result +=a;
        }
        System.out.println("Addition of values is "+result);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(12,15);
        addition.add(12,15,9);
        addition.add(12,15,2,1);
        VarargsAddition varargsAddition = new VarargsAddition();
        varargsAddition.sum(1,2,3,4,5,6);
    }

}

/*
Addition of 2 numbers : 27
Addition of 3 numbers : 36
Addition of 4 numbers : 30
Addition of values is 21

 */