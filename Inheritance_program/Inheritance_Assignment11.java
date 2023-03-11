//Create a parent class called "Shape" and create two child classes "Rectangle" and "Square"
//        that inherit from it. Override the area method in the Square class.

class shape2{

    void area(){

    }
}
class rectangle1 extends shape2{

    @Override
    void area() {
        int b=4,h=3;
      double area_of_rect=b*h;
        System.out.println("area of rectangle : "+area_of_rect);

    }
}
class square extends shape2{

    @Override
    void area(){

    }
}
public class Inheritance_Assignment11 {
    public static void main(String[] args) {
        rectangle1 ab = new rectangle1();

        ab.area();
    }
}
