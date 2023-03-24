import java.util.Arrays;

public class insert_element_in_array {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int new_value=12;
        int [] new1=new int [arr.length+1] ;
        int index =5;

        for (int i =0; i < arr.length ; i++) {
            new1[i]=arr[i];

        }
        new1[index]=new_value;
        System.out.println(Arrays.toString(new1));

    }
}
