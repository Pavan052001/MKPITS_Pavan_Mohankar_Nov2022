//Write a Java program to create a HashSet and remove some elements from it.

import java.util.HashMap;
import java.util.HashSet;

public class remove_element_from_hashset {

    public static void main(String[] args) {

        HashSet<Integer>ab=new HashSet<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);

        System.out.println(ab);
        ab.remove(4);
        System.out.println(ab);
    }
}
