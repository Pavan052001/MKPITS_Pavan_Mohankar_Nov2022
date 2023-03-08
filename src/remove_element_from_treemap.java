
//Write a Java program to create a TreeMap and remove some elements from it.

import java.util.TreeMap;

public class remove_element_from_treemap {

    public static void main(String[] args) {

        TreeMap<Integer,String>ab=new TreeMap<>();

        ab.put(1,"ram");
        ab.put(2,"raj");
        ab.put(3,"swami");

        System.out.println(ab);

        ab.remove(1);
        System.out.println(ab);
    }
}
