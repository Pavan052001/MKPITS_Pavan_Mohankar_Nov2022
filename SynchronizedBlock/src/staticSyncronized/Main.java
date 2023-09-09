package staticSyncronized;

public class Main {
    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();
        threadOne.setName("First thread =");
        threadOne.setPriority(9);

        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.setName("Second Thread =");
        threadTwo.setPriority(8);

        ThreadThree threadThree = new ThreadThree();
        threadThree.setName("Third Thread =");
        threadThree.setPriority(7);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
