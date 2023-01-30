public class exceptionhandling{

public static void main(String[] args){
 int a=2;
 int c=0;

 System.out.println("Start program");

  try{

  c=a/0;
	  }
	  catch(ArithmeticException	e){

		  System.out.println("Exception generated")	;
	  }


     System.out.println("End program"+c);
}
}