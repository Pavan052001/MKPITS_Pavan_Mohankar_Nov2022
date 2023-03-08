public class negative_positive_numbers_from_array {

    public static void main(String[] args) {
         int arr[]={1,2,3,-4,-5,6,0};
         int count=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>0){

                count++;
            }
             if(arr[i]<0){

                count1++;
            }
            if(arr[i]==0){

                count2++;
            }

        }
        System.out.println("positive number is :"+count);
        System.out.println("negative number is :"+count1);
        System.out.println("zero number is :"+count2);
    }
}
