

class find_max_element{

public static void main(String[] args){


int arr[]={110,16,54,32};

for(int i=0;i<arr.length;i++){}

if(arr[0]>arr[1] && arr[0]>arr[2]&& arr[0]>arr[3]){

System.out.println("max="+arr[0]);
}
else if(arr[1]>arr[0]&& arr[1]>arr[2]&&arr[1]>arr[3]){

	System.out.println("max="+arr[1]);

	}
	else if (arr[3]>arr[0]&& arr[3]>arr[1]&&arr[3]>arr[2]){

		System.out.println("max="+arr[2]);

		}

        else // (arr[2]>arr[0]&& arr[2]>arr[1]&&arr[2]>arr[3]){

			{
			System.out.println("max"+arr[2]);

				}



}
}