import java.util.Scanner;

public class palan{


public static void main(String[] args){


Scanner sc =new Scanner(System.in);
System.out.println("Enter the String");


String str= sc.next();
//String org_str=str;
String rev="";
int len=str.length();

System.out.println(len);


 for(int i=len-1;i>=0;i--)

 {
 rev=rev+str.charAt(i);
//System.out.println(i);

 }
 if(str.equals(rev)){

 System.out.println("palindrom");

 }
 else
 {
 System.out.println(" not palindrom");
 }


}


}