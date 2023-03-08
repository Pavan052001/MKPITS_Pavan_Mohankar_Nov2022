import java.util.Iterator;
import java.util.LinkedList;

public class linklist_iterate_elements {

    public static void main(String[] args) {
        LinkedList<Integer>ab = new LinkedList<>();

        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);

        Iterator p=ab.listIterator(0);

        while (p.hasNext()){

            System.out.println(p.next());
        }
    }
}
