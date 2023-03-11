//Create a parent class called "Animal" and create three child classes "Dog", "Cat" and "Bird"
//        that inherit from it. Each child class should have its own unique method.


class animal{
    void animals_type(){

    }
}
class dog extends animal{
    void sound(){
        System.out.println("woow woow");
    }
}
class cat extends dog{
    void cat_sound(){
        System.out.println("meau meau");
    }
}
class bird extends cat{
    void birds(){
        System.out.println("birds are fly in the sky");
    }
        }
public class Inheritance_Assignment02 {
    public static void main(String[] args) {

        bird obj = new bird();
        obj.sound();
    }
}
