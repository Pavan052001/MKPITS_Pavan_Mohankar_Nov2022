//Create a parent class called "Food" and create two child classes "Fruit" and "Vegetable".
//        Each child class should have its own unique method.

class Food{

     void type_of_food(){
         System.out.println("japanese, chainese ");

    }
}
class Fruits extends Food{

    void type_of_fruits(){
        System.out.println("mango, banana, apple");
    }
}
class Vegetables extends Fruits{

    void type_of_vegetables(){
        System.out.println("tomato,potato,chili");
    }
        }
public class Inheritance_Assignment15 {
    public static void main(String[] args) {
        Vegetables obc= new Vegetables();
        obc.type_of_vegetables();
        obc.type_of_food();
        obc.type_of_fruits();
    }
}
