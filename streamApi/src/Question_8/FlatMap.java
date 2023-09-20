package Question_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {



        List<List<Integer>> listoflist = new ArrayList<>();

        listoflist.add(Arrays.asList(1,2,3,4));
        listoflist.add(Arrays.asList(5,6,7,8));
        listoflist.add(Arrays.asList(9,10));
        System.out.println(listoflist);

      int sum=  listoflist.stream().flatMap(li->li.stream()).collect(Collectors.toList()).stream().reduce(0,Integer::sum);

        System.out.println(sum);







    }
}
