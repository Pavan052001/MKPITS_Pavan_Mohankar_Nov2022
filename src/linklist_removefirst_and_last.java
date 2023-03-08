import java.util.LinkedList;

public class linklist_removefirst_and_last {

    public static void main(String[] args) {

        LinkedList<Integer> ab=new LinkedList<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);

        ab.remove(0);
        ab.remove(2);

        System.out.println(ab);
    }
}
