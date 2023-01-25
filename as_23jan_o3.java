


//Write a C program to to test if a given non-negative number is a multiple of 13 or it is one more than a multiple of 13.

import java.util.*;

class multiple_of_13
{
 void set()
 {
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the non-negative digit");
 	int n1 = sc.nextInt();

 	//condition
 	if(n1%13==0 )
 	{
	System.out.println("multiple of 13");
	}else if(n1%13==1){							//or it is one more than a multiple of 13.
		System.out.println("multiple of 13");
		}
 	else
 	{
		System.out.println("not-multiple of 13");
		}
 }
}
public class as_23jan_o3
{
public static void main(String[] args)
{
multiple_of_13 ob = new multiple_of_13();
ob.set();

}
}