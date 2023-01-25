// 16 Write a java program to create a new array taking the first and last elements of a given array of integers and length one or more.


import java.util.Arrays;

public class as_16_23jan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = {arr[0], arr[arr.length - 1]};

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}


