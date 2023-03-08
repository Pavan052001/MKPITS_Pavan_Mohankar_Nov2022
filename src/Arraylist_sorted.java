//Write a Java program to create an ArrayList and sort its elements.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist_sorted {

    public static void main(String[] args) {

        ArrayList<Integer>ab=new ArrayList<>();

        ab.add(3);
        ab.add(5);
        ab.add(6);
        ab.add(4);
        ab.add(2);
        ab.add(1);

        System.out.println(ab);

        Collections.sort(ab);

        System.out.println(ab);
    }
}
