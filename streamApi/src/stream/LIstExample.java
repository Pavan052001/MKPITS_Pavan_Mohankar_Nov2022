package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LIstExample {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumOfEvenNumNumber = number.stream().filter(count -> count % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of even numbers numbers is :" + sumOfEvenNumNumber);

        int maxNum = number.stream().reduce(0, (Integer::max));
        System.out.println("MAx number is " + maxNum);

        number.stream().sorted().forEach(System.out::println);
        System.out.println(" " );


        List<String> cities = Arrays.asList("Pavan"," Doremon","Ishita","Ankita","pavan","Pranay");

        cities.stream().map(name->name).collect(Collectors.toList()).forEach(System.out::println);

        cities.stream().sorted().forEach(System.out::println);

        number.stream().map(i->i*2).forEach(System.out::println);




    }
}
