public class array_2_element_shift {

    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5};
        int c=0,j=0;
        int k=2;
        int temp[]= new int [k];

        for (int i = 0; i < k; i++) {
            temp[i]= arr[i];

        }
        int narr[] = new int[arr.length];

        for (int i = k; i <arr.length ; i++) {

            narr[c]=arr[i];
            c++;
        }
        for (int i = 0; i < temp.length; i++) {
            narr[c]=temp[i];
            c++;
           // System.out.println(narr[i]);
        }
        for (int i = 0; i < narr.length; i++) {
             System.out.println(narr[i]);
        }
      //  System.out.println();
    }
}
