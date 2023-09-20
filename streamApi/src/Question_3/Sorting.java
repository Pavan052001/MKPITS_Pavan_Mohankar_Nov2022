package Question_3;

import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,6,54,3,3,3);

        list.stream().sorted().forEach(System.out::println);
    }
}
