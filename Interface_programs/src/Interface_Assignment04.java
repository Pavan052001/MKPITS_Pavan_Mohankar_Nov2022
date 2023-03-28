//Vehicle interface and car and motorcycle classes:
//        Create an interface called Vehicle that has two abstract methods: start() and stop().
//        Then create two classes called Car and Motorcycle that implement the Vehicle interface.
//        The Car class should have instance variables for the car's make and model,
//        and the Motorcycle class should have an instance variable for the motorcycle's engine size.
//        Implement the start() and stop() methods for each class.

interface Vehicle{
    void Start();
    void Stop();
}
class car implements Vehicle{
    public String car="audi";
    @Override
    public void Start() {
        System.out.println("start");
    }

    @Override
    public void Stop() {
        System.out.println("stop");
    }
}
class Motorcycle implements Vehicle{
        public String Motorcycle_engine="bmw_340cc";

    @Override
    public void Start() {
        System.out.println("start");
    }

    @Override
    public void Stop() {
        System.out.println("stop");
    }
}
public class Interface_Assignment04 {
    public static void main(String[] args) {

        Motorcycle m = new Motorcycle();
        m.Start();
        m.Stop();
        car c = new car();
        c.Start();
        c.Stop();
    }
}
