//Vehicle interface and car and truck classes:
//        Create an interface called Vehicle that has two abstract methods: drive() and
//        stop(). Then create two classes called Car and Truck that implement the Vehicle
//interface. The Car class should have instance variables for the car's make and
//        model, and the Truck class should have instance variables for the truck's load
//        capacity and towing capacity. Implement the drive() and stop() methods for
//        each class

interface vehicle{

    void drive();
    void stop();

}
class cars implements  vehicle{
    public String car_making="";
    public String car_model="";
    @Override
    public void drive() {
        System.out.println("dont drink and drive");

    }

    @Override
    public void stop() {
        System.out.println("firstly check nearby vehicle then stop");

    }
}
class truck implements  vehicle{
    public String load_capacity= "8 ton";
    public  String towing_capacity="two cars";
    @Override
    public void drive() {
        System.out.println("truck use as towing vehicle");
    }

    @Override
    public void stop() {
        System.out.println("truck is stop using airbreak");
    }
}
public class interface_assignment09 {
    public static void main(String[] args) {
        cars c = new cars();
        c.drive();
        c.stop();

        truck t = new truck();
        t.drive();
        t.stop();
    }
}
