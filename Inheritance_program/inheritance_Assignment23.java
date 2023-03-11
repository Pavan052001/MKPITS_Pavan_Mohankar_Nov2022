//Create a parent class called "Shape" and create two child classes "Rectangle" and "rombus"
//        that inherit from it. Override the area method in the Rectangle class.

class aakar{
    void diff_area(){

    }
}
class rect_angle extends aakar{
    @Override
    void diff_area() {
        System.out.println("overrided from aakar");
        super.diff_area();
    }
}
class rombus extends rect_angle{

    void side(){
        System.out.println("opposite sides are same");
    }
}
public class inheritance_Assignment23 {
    public static void main(String[] args) {
        rombus r = new rombus();
        r.side();
        r.diff_area();
    }
}
