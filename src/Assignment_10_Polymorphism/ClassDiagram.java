package Assignment_10_Polymorphism;

interface Shaps{
    String color="Red";
    void getArea();
}
class Rectangle  implements Shaps{
    int l,b;
    Rectangle(){
        l=1;
        b=1;
    }
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+l*b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", b=" + b +
                '}';
    }
}
class Triangle implements Shaps{
    int base,height;
    Triangle(){
        base=0;
        height=0;
    }
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+height*base/2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
public class ClassDiagram {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shaps shaps = new Rectangle(12,34);
        shaps.getArea();
        Triangle triangle = new Triangle();
        Shaps shaps1 = new Triangle(54,50);
        shaps1.getArea();
        System.out.println(shaps);
        System.out.println(shaps1);
    }

}


/*
Area is : 408
Area is : 1350
Rectangle{l=12, b=34}
Triangle{base=54, height=50}
 */