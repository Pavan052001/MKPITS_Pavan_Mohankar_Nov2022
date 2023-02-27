class CopyElement_of_array{

public static void main(String[] args){

int arr[]={1,2,3,4,5,6};

int copyarr[]=new int[arr.length];


for(int i=0;i<arr.length;i++){

	copyarr[i]=arr[i];
	System.out.println(copyarr[i]);

	}
/*
	System.out.println("Element of original array;");

for(int i=0;i<arr.length;i++){

	System.out.println(arr[i]);
	}

	System.out.println("Element of copy array");

for( int i=0;i<copyarr.length;i++){

	 System.out.println(+copyarr[i]);
	}
*/
}
}