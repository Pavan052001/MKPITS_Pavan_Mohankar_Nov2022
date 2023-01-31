import java.util.*;
class  evenException extends Exception

{
 evenException(String s)
{
super(s);
}

}
class  oddException extends Exception

{
 oddException(String a1)
{
super(a1);
}

}

class even1{

public static void main(String[] args)throws Exception{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();


if(a%2==0){
evenException ob= new evenException("even number");
   throw ob;
}
else
{
   oddException ob1= new oddException("odd number");
   throw ob1;
}

}
}
