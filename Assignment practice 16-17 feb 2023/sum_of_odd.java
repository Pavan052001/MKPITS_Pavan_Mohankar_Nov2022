import java.util.Scanner;

public class sum_of_odd {
    public static void main(String[] args) {
        int total =0;

        Scanner sc = new Scanner(System.in);
        int   number = sc.nextInt();
        System.out.println("enter number");
        for (int i=1; i<=number;i++){
                total=2*i-1;
        }
        System.out.println(total);
    }
}
