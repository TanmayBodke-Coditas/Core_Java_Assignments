package Assignment_9;

abstract class Shape{
    abstract public void area();
}

class Circle extends Shape{

    @Override
    public void area() {
        System.out.println("This is area of circle");
    }
}

class Square extends Shape{

    @Override
    public void area() {
        System.out.println("This is area of Square");
    }
}

class Cylinder extends Circle{
   public void area(){
       super.area();
       System.out.println("This is area of Cylinder");
   }
}

class Rectangle extends Square{
    public void area(){
        super.area();
        System.out.println("This is area of Rectangle");
    }
}
public class ShapeAbstraction {
    public static void main(String[] args) {
       Cylinder cylinder = new Cylinder();
       cylinder.area();

       Rectangle rectangle = new Rectangle();
       rectangle.area();


    }
}

/*
This is area of circle
This is area of Cylinder
This is area of Square
This is area of Rectangle
 */