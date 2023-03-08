//Write a Java program to create a TreeMap and get the value of a specific key.

import java.util.TreeMap;

public class treemap_get_value_by_key {
    public static void main(String[] args) {

        TreeMap<Integer,String>ab=new TreeMap<>();
        ab.put(1,"pavan");
        ab.put(2,"vimoksh");
        ab.put(3,"sachin");

        String s =ab.get(2);
        String e = ab.get(3);

        System.out.println(s);
        System.out.println(e);
    }
}
