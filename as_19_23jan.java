//19

public class as_19_23jan{
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30};
        boolean result = checkArray(arr);
        System.out.println(result);
    }

    public static boolean checkArray(int[] arr) {
        int count10 = 0, count20 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                count10++;
            }
            if (arr[i] == 20) {
                count20++;
            }
        }
        return (count10 >= 2 || count20 >= 2);
    }
}
