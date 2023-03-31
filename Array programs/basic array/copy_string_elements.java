import java.util.Arrays;

// copy string element into new array
 class copy_string_elements {
    public static void main(String[] args) {

        String arr[]={"pavan","sachin","aman","nitin",};
        String arr1[]= {"omkar","vijay","pranay","vishal"};
        String arr2[] = new String[arr.length + arr1.length];

        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr1,0,arr2,4,arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }

    }
}
