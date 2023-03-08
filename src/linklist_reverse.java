//Write a Java program to create a LinkedList and reverse its elements.

import java.util.Collections;
import java.util.LinkedList;

public class linklist_reverse {
    public static void main(String[] args) {

        LinkedList<Integer>ab=new LinkedList<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);

        System.out.println(ab);

        Collections.reverse(ab);

        System.out.println(ab);
    }
}
