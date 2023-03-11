//Create a parent class called "Animal" and create two child classes "DomesticAnimal" and
//        "WildAnimal". Each child class should have its own unique method.


class animal_type{

    void diff_type(){

        System.out.println(" different type of animals");
    }
}
class DomesticAnimal extends animal_type{

    void domestic_animal(){
        System.out.println(" goat, chicken,dogs are domestic animal");
    }
}
class wildAnimals extends DomesticAnimal{

    void wild_animal(){

        System.out.println("tiger lion cheetah are wild animals");
    }
}
public class Inheritance_Assignment25 {
    public static void main(String[] args) {

        wildAnimals f = new wildAnimals();
        f.diff_type();
        f.wild_animal();
        f.domestic_animal();

    }
}
