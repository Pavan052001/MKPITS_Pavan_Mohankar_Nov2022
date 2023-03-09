import java.util.Scanner;

//Write a Java  program that takes four numbers as input to calculate and print the average.
public class find_average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter first number");
        int b=sc.nextInt();

        System.out.println("Enter first number");
        int c=sc.nextInt();

        System.out.println("Enter first number");
        int d=sc.nextInt();

        int average=(a+b+c+d)/4;

        System.out.println("average of four number is :"+average);
    }
}
