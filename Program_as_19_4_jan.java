import java.util.*;

class sachin
{int a,b,sum;

void collect(){

Scanner sc = new Scanner(System.in);
System.out.println("Enter first integer");
a = sc.nextInt();
System.out.println("Enter first integer");
b = sc.nextInt();

}
void calculate()
{

	sum=a+b;
	if(a==b)
	{
		System.out.println("multiplication :" +((a+b)*3));
	}
	else
	{
		System.out.println("sum :"+sum);
	}

}
 public class Program_as_19_4_jan
 {
 public static void main(String[] args)
 {

 sachin ob = new sachin();
    ob.collect();
    ob.calculate();

}


 }

 }