 // 14 java Write a java program to reverse a given array of integers and length 5.
  class as_14_23jan{

    void set(){

		int i=0;
    int []arr =new int[]{1,2,3,4,5};

System.out.println("Original array:");
  for (i=0;i<arr.length;i++)
  {
  System.out.println(+arr[i]);
  }
  System.out.println("reverse array");
  for (i=arr.length-1;i>=0;i--)
  {
	  System.out.println(+arr[i]);
  }
}
  }
   public class revarray{
   public static void main(String[] args){

   reverse ob=new reverse();
   ob.set();

   }
   }