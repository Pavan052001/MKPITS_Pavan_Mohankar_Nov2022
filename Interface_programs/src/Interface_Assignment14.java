//Color interface and red, green, and blue classes:
//        Create an interface called Color that has one abstract method: getColorCode().
//        Then create three classes called Red, Green, and Blue that implement the Color
//interface. Each class should have an instance variable for its corresponding color
//        code (e.g., "FF0000" for red). Implement the getColorCode() method for each
//class.

interface color{
    void getColorCode();
}
class red implements  color{
        public String code="#FFOOOO";
    @Override
    public void getColorCode() {
        System.out.println("color code of red color is :"+code);
    }
}
class green implements  color{
    public String color_code="#OOFFOO";
    @Override
    public void getColorCode() {
        System.out.println("color code of green color is : "+color_code);
    }
}
public class Interface_Assignment14 {

    public static void main(String[] args) {
        red r = new red();
        r.getColorCode();

        green g = new green();
        g.getColorCode();

    }
}
