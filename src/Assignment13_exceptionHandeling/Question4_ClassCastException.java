package Assignment13_exceptionHandeling;

class DemoCastParent{
    int id;

    public DemoCastParent(int id) {
        this.id = id;
    }

    void display(){
        System.out.println(id);

    }
}
class DemoCastChild extends DemoCastParent {
    String name;
    public DemoCastChild(int id,String name) {
        super(id);
        this.name = name;
    }
    void displays(){
        System.out.println(id+" "+name);
    }
}
public class Question4_ClassCastException {
    public static void main(String args[]){
        DemoCastParent demoCastParent = new DemoCastParent(65);
        try{
            DemoCastChild demoCastChild = (DemoCastChild) demoCastParent;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Exception is handeled");
        }

    }
}


/*
java.lang.ClassCastException: Assignment13_exceptionHandeling.DemoCastParent cannot be cast to Assignment13_exceptionHandeling.DemoCastChild
Exception is handeled
 */