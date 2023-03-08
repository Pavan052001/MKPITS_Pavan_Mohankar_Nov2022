import java.util.Scanner;
//Write a C program to remove any negative sign in front of a number.Input a value (negative).
public class remove_negative_sign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("negative number");
        int a= sc.nextInt();

        int d= Math.abs(a);
        System.out.println("negative convert into positive number : "+d);
    }
}
