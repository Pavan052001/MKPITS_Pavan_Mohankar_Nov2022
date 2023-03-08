// Write a Java program to create a Stack and pop some elements from it.
import java.util.Stack;

public class Stack_pop_element {
    public static void main(String[] args) {

        Stack<Integer>ab=new Stack<>();
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);

        System.out.println(ab);

        ab.pop();
        System.out.println(ab);



    }
}
