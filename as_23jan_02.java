

//  2 Write a C program that accept two integers and return true if either one is 5 or their sum or difference is 5.

import java.util.*;

class sum_or_difference_is_5
{
	int sum,diff;
	void set()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st integer");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd integer");
	int n2 = sc.nextInt();

//condition

if(n1 == 5 || n2 == 5)
{
System.out.println("true");
}else{
	if((n1+n2) == 5 || (n1-n2) == 5)
	{
	sum = n1+n2;
	diff = n1-n2;
	System.out.println("true"+sum+";"+diff);
	}
}
}
}

public class as_23jan_02
{
public static void main (String[] args)
{
sum_or_difference_is_5 ob = new sum_or_difference_is_5();
ob.set();

}
}