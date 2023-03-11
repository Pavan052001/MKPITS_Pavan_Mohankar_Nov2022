//Create a class called "Vehicle" with two child classes "Car" and "Truck".
//        Each child class should have its own unique method.


class Vehicles{
    void vehicle_type(){

        System.out.println("type of vehicle");
    }
}
class Car1 extends Vehicles{

    void type_of_cars(){
        System.out.println(" car is tourist type ");
    }

}
class truck extends Car1{

    void truck_type(){

        System.out.println("transport type ");
    }

}

public class Inheritance_Assignment12 {
    public static void main(String[] args) {
        truck ob = new truck();
        ob.truck_type();
        ob.type_of_cars();
        ob.vehicle_type();
    }
}
