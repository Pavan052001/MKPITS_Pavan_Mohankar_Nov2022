// 11Write a C program to check a given array of integers of length 1 or more and return true
//if the first element and the last element are equal in the given array.

public class as_11_23jan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean result = checkArray(arr);
        System.out.println(result);
    }

    public static boolean checkArray(int[] arr) {
        return (arr[0] == arr[arr.length-1]);
    }
}
