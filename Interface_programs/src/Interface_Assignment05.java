// Shape interface and square and triangle classes:
//        Create an interface called Shape that has two abstract methods: getArea() and
//        getPerimeter(). Then create two classes called Square and Triangle that
//        implement the Shape interface. The Square class should have an instance
//        variable for the side length of the square, and the Triangle class should have
//        instance variables for the base and height of the triangle. Implement the
//        getArea() and getPerimeter() methods for each class.



import java.util.Scanner;

interface shape1{
   void getArea();
   void getPerimeter1();

}
class Square implements shape1{
Scanner sc = new Scanner(System.in);

 int a= sc.nextInt();
 int area;


    @Override
    public void getArea() {
        System.out.println("side is :");
        area =a*a;
        System.out.println("area of square :"+area);
    }

    @Override
    public void getPerimeter1() {
        int perimeter = 4*a;
        System.out.println("perimeter of square is :"+perimeter);
    }
}
class Triangle implements  shape1{
        Scanner s = new Scanner(System.in);
        int height = s.nextInt();
        int base = s.nextInt();

      int perimeter;
        double area;
    @Override
    public void getArea() {
        System.out.println("Enter height :"+height);
        System.out.println("Enter base :"+base);

        area = 0.5*height*base;
        System.out.println("Area of triangle is :"+area);
    }

    @Override
    public void getPerimeter1() {

        perimeter= base+height;
        System.out.println("perimeter of triangle :"+perimeter);

    }
}
public class Interface_Assignment05 {
    public static void main(String[] args) {
        Square s = new Square();
        s.getArea();
        s.getPerimeter1();

        Triangle t = new Triangle();
        t.getArea();
        t.getPerimeter1();
    }

}
