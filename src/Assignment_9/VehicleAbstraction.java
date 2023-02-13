package Assignment_9;


//Que_1
abstract class Vehicle{
    abstract public void display();
}

class Car extends Vehicle{

    @Override
    public void display() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle{

    @Override
    public void display() {
        System.out.println("Truck has bad engine");
    }
}
public class VehicleAbstraction {
    public static void main(String[] args) {

        System.out.println("-----------------OUTPUT OF QUE1------------------------------");
        Car car = new Car();
        car.display();

        Truck truck = new Truck();
        truck.display();

    }
}
