import java.util.*;


class first_charecter_Uppercase{

public static void main(String [] args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter a string :");

String a = sc.next();

String a1 = a.substring(0,1);
String a2 = a.substring(1);


String s1 =a1.toUpperCase();
String s2 =a2.toLowerCase();



System.out.println(s1+s2);





}

}