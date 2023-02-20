package Assignment_10_Polymorphism;

class Enum {
    public enum RED{STOP};
    public enum GREEN{GO};
    public enum YELLOW{DRIVE};

}
public class Question5_Enum {
    public static void main(String[] args) {
        System.out.println("RED MEANS "+ Enum.RED.valueOf("STOP"));
        Enum.GREEN green = Enum.GREEN.GO;
        System.out.println("GREEN MEANS "+green);
        System.out.println("YELLOW MEANS "+ Enum.YELLOW.valueOf("DRIVE"));
    }
}


/*
RED MEANS STOP
GREEN MEANS GO
YELLOW MEANS DRIVEs
 */