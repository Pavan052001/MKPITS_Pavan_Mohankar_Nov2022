//) GeometricShape interface and rectangle and circle classes:
//        Create an interface called GeometricShape that has one abstract method:
//        getArea(). Then create two classes called Rectangle and Circle that implement
//        the GeometricShape interface. The Rectangle class should have instance
//        variables for the length and width of the rectangle, and the Circle class should
//have an instance variable for the radius of the circle. Implement the getArea()
//        method for each class

interface GeometricShape{
    void getArea();
}
class rectangle1 implements  GeometricShape{
public int length= 8;
public  int width= 3;
        public int area;
    @Override
    public void getArea() {
        area= length*width;
        System.out.println("area of rectangle is :"+area);
    }
}
class circle1 implements  GeometricShape{
public int r=5;
public double area;
    @Override
    public void getArea() {
        area =  (3.14*r*r);
        System.out.println("area of circle :"+area);
    }
}
public class Interface_Assignment08 {
    public static void main(String[] args) {
        rectangle1 r = new rectangle1();
        r.getArea();

        circle1 c= new circle1();
        c.getArea();
    }
}
