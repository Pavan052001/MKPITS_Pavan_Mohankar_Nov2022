
class Count_Repeated_Element_Of_Array{

	public static void main(String[] args){


 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("repeated elements in array =");


        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
             // if(arr[i] == arr[j]){

             System.out.println(arr[j]);
		// }

			}

		}

	}

}