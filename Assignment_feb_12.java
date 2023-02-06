// 12 Write a C program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies.

import java.util.*;

class Assignment_feb_12{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter x-Axis co-ordinate");
int x = sc.nextInt();
System.out.println("Enter y-Axis co-ordinate");
int y = sc.nextInt();

if(x>0 &&y>0)
{
	System.out.println("First quadrant");
	}
else if(x<0 && y>0)
{
	System.out.println("Second quadrant");
	}
else if(x<0 && y<0)
{
	System.out.println("Third quadrant");
	}
else if(x>0 && y<0)
{
	System.out.println("Forth quadrant");
	}

}
}