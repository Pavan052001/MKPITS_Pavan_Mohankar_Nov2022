public class triple_present_in_array {
    public static void main(String[] args) {

        int arr[] ={1,2,5,5,5};
        int count=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i]==arr[j]){

                   count++;

                }

            }

        }
        System.out.println("dublicate count"+count);
    }
}
