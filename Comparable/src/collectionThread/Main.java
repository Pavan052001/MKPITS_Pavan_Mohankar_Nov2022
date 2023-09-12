package collectionThread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main extends Thread {
    //public static ArrayList<String> l = new ArrayList<>(); // throws ConcurrentModificationException
    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        l.add("D");
        l.add("E");
        l.add("F");

        Main m = new Main();
        m.start();


        for (String s : l) {
            String a = s;
            System.out.println(a);
        }
        System.out.println(l);

    }

    @Override
    public void run() {
        try {
            l.add("A");
            l.add("B");
            l.add("C");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}









