// 17 Write a java program to check if a given array of integers and length 2, contains 15 or 20.


import java.util.Scanner;

public class as_17_23jan {
    public static void main(String[] args) {
        int[] arr = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        for (int i = 0; i < 2; i++) {
            arr[i] = input.nextInt();
        }

        if(arr[0] == 15 || arr[0] == 20 || arr[1] == 15 || arr[1] == 20) {
            System.out.println("Array contains 15 or 20");
        } else {
            System.out.println("Array does not contain 15 or 20");
        }
    }
}
