public class remove_duplicates_from_array {

    public static void main(String[] args) {
        int index=0;
        int[] arr ={1,2,3,4,5,6,5,4,3,2,1};
        int size = arr.length;
        int duplicate,flag=0,count=0;
        int[] anti_dup= new int[size];
        int i,j;
        System.out.println("Before removing duplicate from the array:");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        for(i=0;i<size;i++)
        {
           // count=0;
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count=count+1;
                    break;
                }

            }
            if(count==0)
            {
                anti_dup[index]=arr[i];
                index++;
            }
        }

        for(i=0;i<index;i++)
        {
            arr[i]=anti_dup[i];
        }
        System.out.println("After removing duplicate from the array");
        for(i=0;i<index;i++)
        {
            System.out.println(arr[i]);
        }

    }
}