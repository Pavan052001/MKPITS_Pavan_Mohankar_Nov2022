//Write a C program to read roll no, name and marks of three subjects and calculate the total, percentage and division.

import java.util.*;

class Assignment_feb_15{

public static  void main(String[] args){

Scanner sc =new Scanner(System.in);
System.out.println("Enter Roll number of Student");
int r = sc.nextInt();

System.out.println("Enter name of the student");
String name = sc.next();

System.out.println("marks in Mathematics");
int m = sc.nextInt();

System.out.println("marks in physics");
int p = sc.nextInt();

System.out.println("marks in chemistry");
int c = sc.nextInt();

int total = (m+c+p);
System.out.println(" Total marks of subject ="+total);

 double per= (total/300.0)*100.0;
 System.out.println(" Percentage ="+per);

 if (per>=80){System.out.println(" A Division");}

else if(per>=60){System.out.println(" B Division");}

else if(per>=50){System.out.println(" C Division");}

else{System.out.println(" fail");}




}
}