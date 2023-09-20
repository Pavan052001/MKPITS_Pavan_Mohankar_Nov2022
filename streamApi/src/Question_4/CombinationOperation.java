package Question_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CombinationOperation {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("pavan",21));
        list.add(new Employee("pranay",23));
        list.add(new Employee("ishita",22));
        list.add(new Employee("anki",28));

        Employee employee = list.stream().min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee.getAge()+employee.getName());

//        Employee employee = list.stream().min((x,y)->x.getAge()-y.getAge()).get();

        Employee employee1 =list.stream().max((x,y)-> x.getAge()-y.getAge()).get();
        System.out.println(employee1.getAge()+employee1.getName());


    }
}
