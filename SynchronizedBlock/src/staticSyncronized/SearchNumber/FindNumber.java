package staticSyncronized.SearchNumber;

import java.util.Scanner;

public class FindNumber {
    static void seachNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter find number in array :");
        int number = scanner.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 78, 9};
        int i;

        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==number){

                System.out.println("Position of number in Array is"+i);
                break;
            }
        }
        if(i==arr.length) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        FindNumber.seachNumber();
    }


}
