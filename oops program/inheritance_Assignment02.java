//Create a parent class called "Animal" and create three child classes "Dog", "Cat" and
//        "Bird" that inherit from it. Each child class should have its own unique method.


class Animal{

    void types(){
        System.out.println("different ype of animals");
    }
}
class dog1 extends Animal{
    void dogsound(){

        System.out.println("woow, woow");
    }
}
class cat extends Animal{
    void catsound(){
        System.out.println("meauu meauu");
    }
}
class bird extends Animal{
    void fly(){

        System.out.println("every type of bird are fly");
    }
}
public class inheritance_Assignment02 {
    public static void main(String[] args) {

        Animal b= new Animal();

    }
}
