//Write a Java program to create a LinkedHashMap and add some elements to it.

import java.util.LinkedHashMap;

public class add_element_in_linkedhashmap {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String>ab=new LinkedHashMap<>();

        ab.put(1,"ram");
        ab.put(2,"shyam");
        ab.put(3,"ghanshyam");

        System.out.println(ab);
    }
}
