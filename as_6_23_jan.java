import java.util.Scanner;

public class as_6_23_jan {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a + b == c || a + c == b || b + c == a) {
            System.out.println(" the third integer");
        } else {
            System.out.println(" third integer");
        }
    }
}
