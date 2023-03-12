// copy element of two array into new array

public class Copy_element_of_array_into_new {

    public static void main(String[] args) {

        int arr1[] ={1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        int arr3[] = new int [arr1.length+arr2.length];

        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,5,arr2.length);

        for (int i = 0; i < arr3.length; i++) {

            System.out.println(arr3[i]);
        }
    }
}
