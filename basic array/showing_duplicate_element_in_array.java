public class showing_duplicate_element_in_array {
    public static void main(String[] args) {

        int arr[] ={1,2,3,54,4,3,2,45,66};
                int count=0;
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i]==arr[j]){
                   // count++;
                    System.out.println("dublicate value are :"+arr[i] );
                }

            }

        }
    }
}
