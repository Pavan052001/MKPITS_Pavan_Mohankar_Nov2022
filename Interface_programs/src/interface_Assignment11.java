//Animal interface and cat and dog classes:
//        Create an interface called Animal that has two abstract methods: makeSound()
//        and move(). Then create two classes called Cat and Dog that implement the
//        Animal interface. The Cat class should have an instance variable for the cat's
//        breed, and the Dog class should have an instance variable for the dog's weight.
//        Implement the makeSound() and move() methods for each class.
interface Animals {
    void makeSound();

    void move();
}
class cats implements Animals{
    public String cat_breed="bokka";

    @Override
    public void makeSound() {
        System.out.println("meau meau");
    }

    @Override
    public void move() {
        System.out.println("fast reflexes");
    }
}
class dogs implements  Animals{
    public  int dog_weight=20;
    @Override
    public void makeSound() {
        System.out.println("bhau bhau");
    }

    @Override
    public void move() {
        System.out.println("lazy ");
    }
}
public class interface_Assignment11 {
    public static void main(String[] args) {

        cats c =new cats();
        c.move();
        c.makeSound();

        dogs d = new dogs();
        d.move();
        d.makeSound();

    }
}
