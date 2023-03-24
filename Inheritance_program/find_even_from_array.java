public class find_even_from_array {
    public static void main(String[] args) {
       int count=0;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
       // int arr2[]=new int[10];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.println(arr[i]);
            }

        }
    }

}
