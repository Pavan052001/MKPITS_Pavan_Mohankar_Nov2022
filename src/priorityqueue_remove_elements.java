//Write a Java program to create a PriorityQueue and remove some elements from it.

import java.util.PriorityQueue;

public class priorityqueue_remove_elements {

    public static void main(String[] args) {
        PriorityQueue<Integer>ab=new PriorityQueue<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(6);
        ab.add(4);

        System.out.println(ab);

        ab.remove(6);
        System.out.println(ab);
    }
}
