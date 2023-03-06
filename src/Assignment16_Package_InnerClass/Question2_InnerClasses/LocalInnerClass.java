package Assignment16_Package_InnerClass.Question2_InnerClasses;

class OuterClass {
    public void outerMethod() {
        // Local inner class defined inside the outer method
        class InnerClass {
            public void innerMethod() {
                System.out.println("Inside inner method");
            }
        }

        // Creating an object of the local inner class
        InnerClass innerObj = new InnerClass();

        // Calling the inner method using the inner object
        innerObj.innerMethod();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}

/*
Inside inner method
 */