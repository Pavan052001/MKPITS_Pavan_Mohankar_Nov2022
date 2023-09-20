package Question_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountLeN {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pavan"," Doremon","Ishita","Ankita","pavan","Pranay");
   // Map<Integer,List<String>> map=   names.stream().collect(Collectors.groupingBy((String::length)));
//        System.out.println(map);
        Map<Integer,Long> map=   names.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        map.forEach((key,value)-> System.out.println(key+value));

    }
}
