//Create a parent class called "Shape" and create two child classes "Triangle" and
//        "EquilateralTriangle" that inherit from it. Override the area method in the
//        EquilateralTriangle class.


class different_shape{
    void area(){

        System.out.println("different_shape shaps has different area");
    }
}
class Triangle extends different_shape{
    void threeangle() {
        System.out.println("area of Triange");
        super.area();
    }
}
class EquilateralTriangle extends Triangle{

    @Override
    void area() {
        System.out.println("area of EquilateralTriangle ");
        super.area();
    }
}
public class Inheritance_Assignment19 {
    public static void main(String[] args) {
       EquilateralTriangle e = new EquilateralTriangle();
        e.area();

    }
}
