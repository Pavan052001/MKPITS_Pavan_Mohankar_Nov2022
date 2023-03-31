
import java.util.*;
class  Fibonacci_Series{

public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number for fibonaccci series");
	int n=sc.nextInt();

int a=0,b=1,c;
System.out.print(a+", ");

for(int i=0;i<n;i++){

c=a+b;
a=b;
b=c;
System.out.print(a + ", ");

}

}


}

