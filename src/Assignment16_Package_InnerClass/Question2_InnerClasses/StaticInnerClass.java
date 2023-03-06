package Assignment16_Package_InnerClass.Question2_InnerClasses;

class OuterClass2 {
    private static String outerField = "Outer field";

    public static class InnerClass {
        public void innerMethod() {
            System.out.println("Accessing outer field: " + outerField);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass2.InnerClass innerObj = new OuterClass2.InnerClass();
        innerObj.innerMethod();


    }
}


/*

Accessing outer field: Outer field


 since InnerClass is a static class, we can create objects of InnerClass without creating objects of OuterClass.
 Additionally, static inner classes cannot access non-static members of the outer class.
 */