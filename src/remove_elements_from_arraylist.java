//Write a Java program to create an ArrayList and remove some elements from it.

import java.util.ArrayList;

public class remove_elements_from_arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> ab=new ArrayList<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);

        ab.remove(2);


        System.out.println(ab);
    }
}
