import java.util.Scanner;

//Write a C program that accepts a positive integer less than 500 and prints out the sum of the digits
//        of this number.
public class sum_of_enter_number_digit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter three digit number");
        int a= sc.nextInt();
        int r,sum=0;
            while(a>0) {
                r = a % 10;
                sum = sum + r;
                a = a / 10;

            }
        System.out.println("sum of enter number : " + sum);
        }

    }

