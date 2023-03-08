import java.util.Scanner;

public class swap_using_third_veriable {

    public static void main(String[] args) {

        int a = 123;
        int b = 456;

        int temp = 0;

        System.out.println(" a & b before swap");
        System.out.println("a ="+a);
        System.out.println("b ="+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("a & b after swap ");

        System.out.println("a ="+a);
        System.out.println("b ="+b);



    }
}
