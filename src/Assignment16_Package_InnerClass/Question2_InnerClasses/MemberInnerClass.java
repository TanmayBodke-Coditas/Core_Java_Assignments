package Assignment16_Package_InnerClass.Question2_InnerClasses;

class OuterClass1 {
    private int outerField = 10;

    public class InnerClass {
        public void innerMethod() {
            System.out.println("Outer field value: " + outerField);
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass innerClass = outerClass1.new InnerClass();
        innerClass.innerMethod();
    }
}

/*
Outer field value: 10
 */