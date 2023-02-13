import java.util.Scanner;

public class reverseSrting{

public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the string");

String s=sc.next();
String rev="";

 int len=s.length();


for(int i=len-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
	}
	//System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("not palindrom");
		}

}
}