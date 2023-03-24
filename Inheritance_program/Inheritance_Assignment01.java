//Create a parent class called "Vehicle" and create two child classes "Car" and "Motorcycle"
//        that inherit from it. Give each child class its own unique method.

class Vehicle{

    void type_of_vehicle(){

    }
}
class Car extends Vehicle{

    void type_of_cars(){

    }
}
class MoterCycle extends Car{
    void type_of_motercycles(){

    }
}
public class Inheritance_Assignment01 {
    public static void main(String[] args) {
        MoterCycle obj = new MoterCycle();
        obj.type_of_cars();
    }
}

