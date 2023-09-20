package Question_9;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(8,7,6,54,3,3,3);

        list.parallelStream().filter(i->i%2==0).forEach(System.out::println);

    }
}
