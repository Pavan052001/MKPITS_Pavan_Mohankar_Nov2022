import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {

        int [] arr={6,5,1,2,3,4,8,7};
        int New[]=new int [arr.length];
        int j=4;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0,k=0; i <arr.length ; i++) {

            if(i!=j){
                New[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(New));
    }
}
