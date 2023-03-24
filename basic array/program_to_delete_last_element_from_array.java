import java.util.Arrays;

public class program_to_delete_last_element_from_array {
    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5};

        int arr1[] =new int[arr.length-1];

        int j=4;

        for (int i = 0,k=0; i <arr.length ; i++) {

            if (i!=j){
                arr1[k]=arr[i];
                k++;

            }

        }
        System.out.println("last element deleted :"+ Arrays.toString(arr1));
    }
}
