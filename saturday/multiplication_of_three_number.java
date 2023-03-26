import java.util.Scanner;

//Write a Java  program to print the output of multiplication of three numbers which will be entered by the user.
public class multiplication_of_three_number {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();

        System.out.println("Enter first number");
        int b= sc.nextInt();

        System.out.println("Enter first number");
        int c= sc.nextInt();

       int multiplication=a*b*c;

        System.out.println("multiplication of three number : "+multiplication);

    }
}
