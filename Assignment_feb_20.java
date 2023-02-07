// Write a C program to check whether an alphabet is a vowel or consonant.
import java.util.*;

class Assignment_feb_20{

public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter any charecter");
 char ch=sc.next().charAt(0);

if(ch=='a' ||ch=='i' ||ch=='e' ||ch=='o' ||ch=='u' )
{
System.out.println("its a vowel");
}
else
{
System.out.println("its a consonant");
}

}
}

