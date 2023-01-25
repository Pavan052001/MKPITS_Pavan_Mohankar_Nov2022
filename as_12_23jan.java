
// 12 Write a C program to check two given arrays of integers of length 1 or more and return true if they have the same first
//element or they have the same last element

public class as_12_23jan {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 1};
        boolean result = checkArrays(arr1, arr2);
        System.out.println(result);
    }

    public static boolean checkArrays(int[] arr1, int[] arr2) {
        return (arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]);
    }
}

