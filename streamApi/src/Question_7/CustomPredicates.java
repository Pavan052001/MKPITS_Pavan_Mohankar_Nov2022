package Question_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CustomPredicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,11,22,12,22,2,2,2);

//        Predicate<Integer> predicate =l->l>10;
//        list.stream().filter(predicate).forEach(System.out::println);

        list.stream().filter(CustomPredicates::smallerThanTen).forEach(System.out::println);
    }

    static boolean smallerThanTen(Integer n){
        return n<10;
    }
}
