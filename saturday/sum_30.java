//Write a C program to check two given integers,
//        and return true if one of them is 30 or if their sum is 30.

import java.util.Scanner;
public class sum_30 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a :" );
        int a= sc.nextInt();
        System.out.println("Enter b :" );
        int b= sc.nextInt();


        if(a+b==30 ||a==30 || b==30){

            System.out.println(true);
        }
        else System.out.println(false);
    }
}
