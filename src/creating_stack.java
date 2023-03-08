import java.util.Stack;

public class creating_stack {
    public static void main(String[] args) {

        Stack<Integer> abc=new Stack<>();

        abc.add(1);
        abc.add(2);
        abc.add(3);

        System.out.println(abc);

        abc.push(4);
        System.out.println(abc);
    }
}
