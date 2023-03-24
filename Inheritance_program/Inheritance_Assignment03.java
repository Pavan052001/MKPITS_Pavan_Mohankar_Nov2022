//Create a class called "Shape" that has a method to calculate its area.
//        Create three child classes "Rectangle", "Triangle", and "Circle" that inherit from
//        the Shape class and override the area method.

class shape{
    void area(){
        System.out.println("all shaps have its area");
    }
}
class rectangle extends  shape{

    @Override
    void area() {
       super.area();
        System.out.println("area of rectangle is l*b");
    }
}
class triangle extends rectangle{
    @Override
    void area() {
        super.area();
        System.out.println("area of triangle is 1/2 * base*height");
    }
}
class circle extends triangle{

    @Override
    void area() {
        super.area();
        System.out.println("Area of circle is 3.14*r*r");
    }
}
public class Inheritance_Assignment03 {

    public static void main(String[] args) {

        shape obj= new shape();
        obj.area();
    }
}
