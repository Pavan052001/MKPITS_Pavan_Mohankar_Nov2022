//Vehicle interface and bicycle and motorcycle classes:
//        Create an interface called Vehicle that has two abstract methods: start() and
//        stop(). Then create two classes called Bicycle and Motorcycle that implement
//        the Vehicle interface. The Bicycle class should have an instance variable for the
//        number of gears, and the Motorcycle class should have an instance variable for
//        the engine displacement. Implement the start() and stop() methods for each
//        clas

interface vehicles{
    void start();
    void stop();

}
class Bicycle implements vehicles{
    public int number_of_gears=5;

    @Override
    public void start() {
        System.out.println("unlock Bicycle and enter the key");
    }

    @Override
    public void stop() {
        System.out.println("remove key from Bicycle");
    }
}
class Motorcycle1 implements vehicles{
    public String Engine_displacement="ctc type";
    @Override
    public void start() {
        System.out.println("start motorcycle in neutral  ");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
public class Interface_Assignment12 {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.start();
        b.stop();

        Motorcycle1 m = new Motorcycle1();
        m.start();
        m.stop();
    }
}
