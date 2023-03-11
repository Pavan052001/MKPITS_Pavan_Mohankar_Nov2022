//Create a parent class called "Animal" and create three child classes "Lion", "Tiger",
//        and "Bear". Each child class should have its own unique method.
//

class wildAnimal{
    void wild_animal(){

        System.out.println("wild animal type");
    }
}
class tiger extends wildAnimal{
    void speed1(){
        System.out.println("speed of tiger is 45 km/h");
    }
}
class lion extends tiger{

    void king(){
        System.out.println("lion is king of forest");
    }
}
class bear extends lion{

    void bark(){
        System.out.println("bear barking");
    }
}
public class Inheritance_Assignment17 {
    public static void main(String[] args) {

        bear b= new bear();
        b.bark();
        b.king();
        b.speed1();

    }
}
