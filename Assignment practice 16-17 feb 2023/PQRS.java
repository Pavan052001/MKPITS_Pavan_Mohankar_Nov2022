import java.util.Scanner;

public class PQRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p");
        int p = sc.nextInt();

        System.out.println("Enter q");
        int q = sc.nextInt();

        System.out.println("Enter r");
        int r = sc.nextInt();

        System.out.println("Enter s");
        int s = sc.nextInt();

        if (r > 0 && s > 0 && p % 2 == 0 && q > r && s > p && (r + s) > (p + q)) {

            System.out.println("correct value");
        }
        else{
            System.out.println("wrong value");
        }
    }
}
