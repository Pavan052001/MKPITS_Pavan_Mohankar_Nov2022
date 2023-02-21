import java.util.Scanner;

public class Specified_range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int a = sc.nextInt();

        if(a<0 || a>80){
            System.out.println("error");

        }
        else {
            System.out.println("run");
        }
    }
}
