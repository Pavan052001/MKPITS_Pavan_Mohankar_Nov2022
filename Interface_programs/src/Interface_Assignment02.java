
//Animal interface and dog and cat classes:
//        Create an interface called Animal that has two abstract methods: makeSound() and move().
//        Then create two classes called Dog and Cat that implement the Animal interface.
//        The Dog class should have an instance variable for the dog's breed,
//        and the Cat class should have an instance variable for the cat's name.
//        Implement the makeSound() and move() methods for each class.

interface Animal{

    void makeSound();
    void move();
}
class dog implements Animal{
   public  String dog="labra";
    @Override
    public void makeSound() {
        System.out.println(dog+" :huff huff sound making");
    }

    @Override
    public void move() {
        System.out.println("dog's move lazily");
    }
}
class cat implements Animal {
public String cat_name="tom";
    @Override
    public void makeSound() {
        System.out.println(cat_name+ " making sound meow meow");
    }
    @Override
    public void move() {
        System.out.println(cat_name +" move fast");
    }
}
public class Interface_Assignment02 {
    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
        d.move();

        cat c = new cat();
        c.makeSound();
        c.move();

    }
}
