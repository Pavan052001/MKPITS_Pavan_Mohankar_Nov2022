// 2Write a C program to create an array taking two middle elements from a given array of integers of length even.

public class assignment_25_jan_02{

public static void main(String[] args){


int []arr = {1,2,3,4,5,6};
int[] newarr = new int[2];

     int middle=arr[arr.length/2];


     newarr[0]=arr[middle-1];
     newarr[1]=arr[middle];


for (int i: newarr){

	System.out.println(i);
}
 }
}