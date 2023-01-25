//15 Write a java program to create a new array containing the middle elements from the two given arrays of integers, each length 5.

import java.util.Arrays;

public class as_15_23jan {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] newArr = {arr1[2], arr2[2]};

        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}
