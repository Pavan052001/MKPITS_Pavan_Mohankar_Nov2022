// 13 Write a C program to rotate the elements of a given array of integers (length 4 ) in left direction and return the new array.

import java.util.Arrays;

public class as_13_23jan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr = rotateLeft(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Rotated Array: " + Arrays.toString(newArr));
    }

    public static int[] rotateLeft(int[] arr) {
        int first = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        return arr;
    }
}
