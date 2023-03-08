import java.util.Scanner;

//Write a C programming that reads in two integers and check whether
//        the first integer is a multiple of the second integer.
public class first_number_multiple_of_second {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

        if (a%b==0){

            System.out.println("a is multiple of b");
        }
        else{

            System.out.println("a is not multiple of b");
        }

    }
}
