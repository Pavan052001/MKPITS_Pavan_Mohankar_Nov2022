//Shape interface and rectangle and circle classes:
//        Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
//        Then create two classes called Rectangle and Circle that implement the Shape interface.
//        The Rectangle class should have instance variables for the length and width of the rectangle,
//        and the Circle class should have an instance variable for the radius of the circle.
//        Implement the getArea() and getPerimeter() methods for each class.

interface  Shape{

     void getarea();
     void getperimeter();

}
 class Rectangle implements Shape{
  public int Length=5, width=3;


     @Override
     public void getarea() {
         int area_of_Rectangle=Length*width;
         System.out.println("area_of_Rectangle is : "+area_of_Rectangle);
     }

     @Override
     public void getperimeter() {
        int perimeter =(2*Length)+(2*width);
         System.out.println("perimeter of Rectangle is :"+perimeter);
     }
 }
 class Circle implements Shape{
         public int r=3;
     @Override
     public void getarea() {
         double area_of_cicle = 3.14*r*r;
         System.out.println("Area of circle :"+area_of_cicle);
     }

     @Override
     public void getperimeter() {
           double perimeter_of_circle =2*3.14*r;
         System.out.println("area of perimeter :"+perimeter_of_circle);
     }
 }
public class Interface_Assignment01 {
    public static void main(String[] args) {
         Rectangle r = new Rectangle();
         Circle c = new Circle();
         r.getarea();
         r.getperimeter();
         c.getarea();
         c.getperimeter();
    }
}
