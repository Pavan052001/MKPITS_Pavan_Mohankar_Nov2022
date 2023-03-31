public class program_to_give_count_of_similar_element_of_array {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,4,5,7,8};
            int count1=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if(arr[i]==arr1[j]){

                   count1++;
                }

            }
          //  System.out.println();

        }
        System.out.println(count1);
    }
}
