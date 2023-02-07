// Write a C program to check whether a triangle is Equilateral, Isosceles or Scalene.


import java.util.Scanner;

public class Assignment_feb_17{

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

   System.out.println("Please Enter Three sides of Triangle ");
    Double side1 = sc.nextDouble();
    Double side2 = sc.nextDouble();
    Double side3 = sc.nextDouble();

if(side1 == side2 && side2 == side3)
      {
	System.out.println("It is an Equilateral Triangle");
	}
	else if(side1 == side2 || side2 == side3 || side1 == side3)
	{
	System.out.println("It is an Isosceles Triangle");
	}
	else
	{
		System.out.println("It is a Scalene Triangle");
	 }
	}
}