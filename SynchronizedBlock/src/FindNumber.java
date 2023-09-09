public class FindNumber {

     public static boolean isNumber() {
         int arr[] = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
         int search = 4;
         boolean flag=false;
         int low = 0;
         int high = arr.length - 1;
         int mid = (low + high) / 2;

         while (arr[mid]<=high) {

             if(arr[mid]==search){
                 flag=true;
//                 return flag;

             }
             else if(arr[mid]>search){
                 low = mid+1;
             }
             else {
                 high=mid-1;
             }
             mid = (low + high) / 2;
         }
         return flag;
     }

    public static void main(String[] args) {
      if (FindNumber.isNumber()){
          System.out.println("found");
      }
      else{
          System.out.println("not found");
      }
    }
}
