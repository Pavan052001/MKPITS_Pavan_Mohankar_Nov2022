package Question_6;

import java.util.Arrays;
import java.util.List;

public class CombineOperator {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,6,54,3,3,3);

        list.stream().filter(x->x%2==0).forEach(System.out::println);

    }
}
