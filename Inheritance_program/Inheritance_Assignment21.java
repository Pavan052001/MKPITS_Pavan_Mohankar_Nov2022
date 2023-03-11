//Create a parent class called "Food" and create two child classes "Dessert" and "MainCourse".
//        Each child class should have its own unique method

class jeven{

    void different_jevan(){

        System.out.println("different type of jeven");
    }
}
class Dessert extends  jeven{

    void Dessert1(){
        System.out.println(" do not eat dessert if you eat you will suffer from gum problem");
    }
}
class MainCourse extends Dessert{

    void maincourse(){

        System.out.println("you will eat main cource before dessert");
    }
}

public class Inheritance_Assignment21 {
    public static void main(String[] args) {

        MainCourse m= new MainCourse();
        m.maincourse();
        m.Dessert1();
        m.different_jevan();
    }
}
