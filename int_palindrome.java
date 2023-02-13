import java.util.*;
public class int_palindrome{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");

int num=sc.nextInt();

int temp=num;

int r;
int rev= 0;

while(num!=0){

     r =num%10;

	 rev=(rev*10)+r;

	 num=num/10;

	}
	if(temp==rev){

		System.out.println("palindrom");
	}
	else
	{
		System.out.println(" not palindrom");
		}




}
}