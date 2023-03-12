import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len= sc.nextInt();
        int sum=0;
        int arr[]= new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= sc.nextInt();

        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("sum of element is :  "+sum);

    }
}
