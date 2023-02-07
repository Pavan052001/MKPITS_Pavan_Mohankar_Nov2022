// Write a C program to check whether a triangle can be formed by the given value for the angles.


import java.util.*;

class Assignment_feb_18{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("first side");
int side1=sc.nextInt();
System.out.println("Second side");
int side2=sc.nextInt();
System.out.println("Third side");
int side3=sc.nextInt();

int sum=side1+side2+side3;

if(sum==180)
{
System.out.println("It is a valid triangle");
}
else
{
System.out.println("It is a Invalid triangle");
}


}
}