class find_min_element{

public static void main(String[] args){


int arr[]={11,16,54,32};

for(int i=0;i<arr.length;i++){}

if(arr[0]<arr[1] && arr[0]<arr[2]&& arr[0]<arr[3]){

System.out.println("min="+arr[0]);
}
else if(arr[1]<arr[0]&& arr[1]<arr[2]&&arr[1]<arr[3]){

	System.out.println("min="+arr[1]);

	}
	else if (arr[3]<arr[0]&& arr[3]<arr[1]&&arr[3]<arr[2]){

		System.out.println("min="+arr[2]);

		}

        else if (arr[2]<arr[0]&& arr[2]<arr[1]&&arr[2]<arr[3]){

				System.out.println("min"+arr[2]);

				}



}
}