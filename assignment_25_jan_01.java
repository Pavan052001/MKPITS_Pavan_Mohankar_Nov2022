// 01 Write a C program to compute the sum of the two given arrays of integers, length 3 and find the array which has the largest sum.

public class assignment_25_jan_01{
public static void main(String[] args){

int sum=0;
int sum1=0;
int []arr={1,2,11};
int[]arr1={4,1,6};


for(int i=0;i<arr.length;i++){
sum=sum+arr[i];

}
System.out.println("arr = "+sum);

for(int i=0;i<3;i++){
	sum1=sum1+arr1[i];
}
System.out.println("arr1 = "+sum1);

if(sum>sum1)
{
	System.out.println("sum of array of arr is greater ="+sum);
}
else{
	System.out.println("sum of array of arr1 is greater ="+sum1);
}

}
}
