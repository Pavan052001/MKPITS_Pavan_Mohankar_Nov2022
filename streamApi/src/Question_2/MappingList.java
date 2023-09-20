package Question_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,6,54,3,3,3);

         List list1=list.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(list1);
    }
}
