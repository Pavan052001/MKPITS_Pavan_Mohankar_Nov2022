import java.util.Scanner;

public class natual_number_reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter natural number");

        int a= sc.nextInt();
        for (int i = a; i >=1 ; i--) {
            System.out.println(i);

        }
    }
}
