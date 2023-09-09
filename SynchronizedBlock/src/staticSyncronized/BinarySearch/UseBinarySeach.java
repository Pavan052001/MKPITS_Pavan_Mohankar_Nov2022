package staticSyncronized.BinarySearch;

public class UseBinarySeach {
    static void searchElement(int arr[]) {
            int search =7;
            int low= 0;
            int high =arr.length-1;
            int mid =(low +high)/2;

            while(arr[mid]<=high){

                if (arr[mid]==search){
                    System.out.println(mid);
                    break;
                }
                else if(arr[mid]<search){
                    low = mid+1;
                }
                else {
                    high=mid-1;
                }
                mid =(low +high)/2;
            }
            if(low>high){
                System.out.println("element not found ");
            }

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        UseBinarySeach.searchElement(arr);
    }
}
