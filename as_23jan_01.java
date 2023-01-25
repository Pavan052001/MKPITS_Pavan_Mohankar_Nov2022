
//return a + b >= 10 && a + b <= 20 ? 30 : a + b;
//Write a C program to compute the sum of the two given integers. If the sum is in the range 10..20 inclusive return 30.

class compute_sum
{
	int n1,n2,sum;
	//boolean n1,n2,sum;
	void set()
	{
		n1=5;
		n2=10;
		sum=n1+n2;
		if((n1 + n2) >=10 && (n1 + n2) <=20 )
		{
			System.out.println("In a range : "+sum);
				if ((n1 + n2) >=10 && (n1 + n2) <=20){
					System.out.println("return = 30");
					}else{System.out.println(sum);}
			}
			else
			{
				System.out.println("Not in a range");
				}
	}
	void dis()
	{
		System.out.println("Sum = "+sum);
	}
}
public class as_23jan_01
{
public static void main(String[] args)
{
	compute_sum ob = new compute_sum();
	ob.set();
	ob.dis();
}
}