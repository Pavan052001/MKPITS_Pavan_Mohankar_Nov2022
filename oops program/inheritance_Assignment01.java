//Create a parent class called "Vehicle" and create two child classes "Car" and
//        "Motorcycle" that inherit from it. Give each child class its own unique method.

class Vehicle{

    void type(){

        System.out.println("there are different type of vehicle");
    }
}
class car extends Vehicle{

    void speed(){

        System.out.println("there are different type of car ");
    }
}
class motorcycle extends Vehicle{

    void degin(){
        System.out.println("different type of motorcycle compony");
    }
}


public class inheritance_Assignment01 {

    public static void main(String[] args) {

        motorcycle a= new motorcycle();
        a.type();

    }
}
