
//Write a Java program to create a HashMap and remove some elements from it.

import java.util.HashMap;

public class remove_elements_from_hashmap {

    public static void main(String[] args) {

        HashMap<Integer,String>ab=new HashMap<>();
        ab.put(1,"aj");
        ab.put(2,"tak");
        ab.put(3,"kal");

        ab.remove(2);

        System.out.println(ab);
    }
}
