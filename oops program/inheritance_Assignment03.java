//Create a class called "Shape" that has a method to calculate its area. Create three child classes
//        "Rectangle","Triangle", and "Circle" that inherit from the Shape class
//and override the area method.

class shape{

    void area(){
        System.out.println("different shapes have different area");
    }
}
class rectangle extends shape{

    @Override
    void area() {
        System.out.println("area of rectangle is 1/2*base*height");
        super.area();
    }
}
class circle extends shape{

    @Override
    void area() {
        System.out.println("area of circle is pai*r*r");
        super.area();
    }
}
public class inheritance_Assignment03 {
    public static void main(String[] args) {
        circle c= new circle();
        c.area();
    }
}
