//Create a parent class called "Building" and create two child classes "House" and
//        "Apartment" that inherit from it. Each child class should have its own unique method.

class building{
    void building_type(){
        System.out.println("different type of building");
    }
}
class house extends building{

    void house1(){
        System.out.println("one family is lives in one house");
    }
}
class apartment extends house{

    void apartment1(){
        System.out.println("in apartment many people are stay in rent");
    }
}
public class Inheritance_Assignment06 {
    public static void main(String[] args) {

        apartment ob = new apartment();
        ob.building_type();
    }
}
