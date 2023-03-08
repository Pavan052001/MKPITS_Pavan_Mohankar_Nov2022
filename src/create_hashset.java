
// Write a Java program to create a HashSet and add some elements to it.

import java.util.HashSet;

public class create_hashset {
    public static  void main(String[] args) {

        HashSet<String> set=new HashSet();

        set.add("pavan");
        set.add("khushal");
        set.add("vatan");

         int a=set.size();

        System.out.println("set"+set);
        System.out.println(a);


    }
}
