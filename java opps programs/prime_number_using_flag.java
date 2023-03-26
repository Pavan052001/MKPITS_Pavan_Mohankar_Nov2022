import java.util.Scanner;

public class prime_number_using_flag {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int flag=0;

        for (int i = 2; i <num ; i++) {

            if(num%i==0){
                flag=1;
                break;


            }
            else{
                flag=0;
            }

        }
        if(flag==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}
