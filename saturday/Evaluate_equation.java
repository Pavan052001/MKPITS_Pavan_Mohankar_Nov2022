import java.util.Scanner;

//Write a C program to evaluate the equation y=xn when n is a non-negative integer.
public class Evaluate_equation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        int y,x=10;

        if (n > 0) {

            y=x*n;
            System.out.println("answer is : "+y);
        }
        }

    }

