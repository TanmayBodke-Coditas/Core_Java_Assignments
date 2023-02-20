package Assignment_10_Polymorphism;

class Shape{
    public void area(int side){
        System.out.println("Area of square is "+ side*side);
    }
    public void area(float radius){
        System.out.println("Area of Circle is "+ 3.14*radius*radius);
    }
    public void area(int length,int breadth){
        System.out.println("Area of Rectangle is "+ length*breadth);
    }
}
public class Area {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5);
        shape.area(11.23f);
        shape.area(5,2);
    }
}

/*
Area of square is 25
Area of Circle is 395.9944737164924
Area of Rectangle is 10
 */
