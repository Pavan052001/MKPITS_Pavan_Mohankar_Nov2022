
//Swap number without using 3rd variable
import java.util.*;


class swapnumber{

public static void main(String[] args){


 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println(" a and b before swapping" +a+ ":" +b);
        a=a+b;
        b=a-b;
        a=a-b;

       System.out.println(" a and b after swapping" +a+ ":" +b);

}


}