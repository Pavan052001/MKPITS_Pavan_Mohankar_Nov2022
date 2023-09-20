package Question_1;

import java.util.Arrays;
import java.util.List;

public class StringStartWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pavan"," Doremon","Ishita","Ankita","pavan","Pranay");
        names.stream().filter(field->field.startsWith("P")).forEach(System.out::println);
    }
}
