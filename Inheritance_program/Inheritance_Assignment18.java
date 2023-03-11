//Create a class called "man" with two child classes "Adult" and "Child". Each child
//class should have its own unique method.

class man{

    void work(){
        System.out.println("work 8 hour per day");
    }
}
class adult extends man{

    void job(){
        System.out.println("adult man looking for job");
    }
}
class child1 extends adult{

    void play(){
        System.out.println("enjoying his childhood");
    }
}
public class Inheritance_Assignment18 {
    public static void main(String[] args) {

        child1 b= new child1();
        b.job();
        b.work();
        b.play();


    }
}
