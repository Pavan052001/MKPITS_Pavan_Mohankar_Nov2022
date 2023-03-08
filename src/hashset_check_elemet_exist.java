//Write a Java program to create a HashSet and check if an element exists in it.

import java.util.HashSet;

public class hashset_check_elemet_exist {

    public static void main(String[] args) {

        HashSet<Integer> ab=new HashSet<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);

        System.out.println(ab);

       boolean contains1= ab.contains(5);
        System.out.println(contains1);
    }
}
