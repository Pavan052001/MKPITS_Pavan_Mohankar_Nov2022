public class array_shift_element {
    public static void main(String[] args) {

        int arr[]={0,1,2,3,4};

        int arr2[]=new int [arr.length];

        int count=0;
        int a=arr[0];
        int b=arr[1];

        for (int i = 2; i < arr.length; i++) {

            arr2[count]=arr[i];
            count++;

        }
        arr2[count]=a;
        arr2[count]=b;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
    }
}
