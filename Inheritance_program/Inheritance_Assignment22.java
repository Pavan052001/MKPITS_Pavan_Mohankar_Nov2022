
//Create a parent class called "parents" and create two child classes "son" and "daughter".
//        Each child class should have its own unique method.

class Parents{
    void care(){
        System.out.println("taking care of child");
    }
}
class son extends Parents{
    void dream(){

        System.out.println("dream to play for india");
    }
}
class daughter extends Parents{

    void smart(){
        System.out.println("taking care of brother");
    }
}
public class Inheritance_Assignment22 {
    public static void main(String[] args) {

        daughter d = new daughter();
        d.smart();
        d.care();
    }
}
