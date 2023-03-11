//Create a parent class called "Animal" and create two child classes "Mammal" and "Bird".
//        Each child class should have its own unique method.

class Animals{

    void type_of_animals(){
        System.out.println("there are two type of animals ");
    }
}
class Mammal extends  Animals{

    void Mammals(){
        System.out.println("mammals walk in four legs");
    }
}
class birds extends  Mammal{
    void birds(){
        System.out.println("bird can fly in sky");
    }
}

public class Inheritance_Assignment09 {
    public static void main(String[] args) {
        birds g= new birds();
        g.type_of_animals();
    }
}
