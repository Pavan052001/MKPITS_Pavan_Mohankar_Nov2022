import java.util.Scanner;

public class multiple_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

                if(a%b==0){
                    System.out.println("multipled");
                }
                else{
                    System.out.println("not multipled");
                }
    }
}
