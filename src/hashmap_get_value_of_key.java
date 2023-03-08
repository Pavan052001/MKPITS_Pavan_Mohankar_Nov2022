//Write a Java program to create a HashMap and get the value of a specific key.


import java.util.HashMap;

public class hashmap_get_value_of_key {

    public static void main(String[] args) {


        HashMap<Integer,String>ab=new HashMap<>();

        ab.put(1,"pavan");
        ab.put(2,"vimoksh");
        ab.put(3,"sachin");

        String s=ab.get(1);
        System.out.println(s);



    }
}
