//20



public class as20_23jan {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 5 && arr[i+1] == 7) {
                newArr[i+1] = 1;
                i++;
            } else {
                newArr[i] = arr[i];
            }
        }
        if(arr.length>1)
          newArr[arr.length - 1] = arr[arr.length - 1];
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
