import java.util.Arrays;
public class delete_element_from_array_using_index {

        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int arr1[]= new int [arr.length-1];
            int index=3;

            for (int i = 0,k=0; i <arr.length ; i++) {
                if(i!=index){

                    arr1[k]=arr[i];
                    k++;
                }

            }
            System.out.println("delete :"+Arrays.toString(arr1));
        }
    }

