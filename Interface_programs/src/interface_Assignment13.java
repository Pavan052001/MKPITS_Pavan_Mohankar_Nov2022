//Shape interface and ellipse and rhombus classes:
//        Create an interface called Shape that has two abstract methods: getArea() and
//        getPerimeter(). Then create two classes called Ellipse and Rhombus that
//        implement the Shape interface. The Ellipse class should have instance variables
//for the major and minor axes, and the Rhombus class should have instance
//        variables for the diagonals. Implement the getArea() and getPerimeter()
//        methods for each class.

interface shapes{
    void getArea();
    void getPerimeter();
}
class Ellipse implements shapes{
    public int x=3;
    public int y=4;
    double area;
    @Override
    public void getArea() {
        area =3.14 *x*y;
        System.out.println("area of Ellipse :"+area);
    }

    @Override
    public void getPerimeter() {
      double p = 3.14*(x+y);
        System.out.println("perimeter of ellipse is "+p);
    }
}
class rhombus implements  shapes{
    public int d1= 3;
    public int d2 = 4;
    public double area;
    @Override
    public void getArea() {
        area=(d1*d2)/2;
        System.out.println("area of rhombus is "+area);
    }

    @Override
    public void getPerimeter() {
            int p = 4*d1 ;
        System.out.println("perimeter of rhombus "+p);
    }
}
public class interface_Assignment13 {
    public static void main(String[] args) {
        Ellipse e = new Ellipse();
        e.getArea();
        e.getPerimeter();

        rhombus r = new rhombus();
        r.getArea();
        r.getPerimeter();
    }
}
