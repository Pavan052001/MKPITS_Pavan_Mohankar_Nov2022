
// 17 Write a C program to check if two given non-negative integers have the same last digit.


//abs(x % 10) == abs(y % 10)
import java.util.*;

   class integer
   {

   int a,b;
   void range()
   {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter first integer a:");
   a = s.nextInt();

    System.out.println("Enter first integer b:");
   b = s.nextInt();

  if (a%10==b%10)
  {
  	System.out.println("integers have the same last digit :"+a +":"+b);
  }
  else
{
  	System.out.println(" Enter integers have not same last digit:");
  }

  }
  }

   public class  program_as_19_17_jan{
   public static void main(String[] args){
    integer ob= new integer();
    ob.range();
   }
   }
