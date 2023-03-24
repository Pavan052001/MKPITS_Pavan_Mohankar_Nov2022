//Create a parent class called "Food" and create three child classes "Pizza", "Burger",
//        and "Sushi" that inherit from it. Each child class should have its own unique method.

class food{
    void type(){

        System.out.println("different type of food");
    }
}
class Pizza extends  food{
    void pizza(){
        System.out.println("pizza is fastfood");
    }
}
class berger extends  Pizza{

    void making(){

        System.out.println("its a layer od bread");
    }
}
class sushi extends berger{

    sushi(){
        System.out.println("its a japanese dish");
    }
}
public class inheritance_Assignment08 {
    public static void main(String[] args) {
        sushi s =new sushi();
        s.pizza();
    }
}
