// Write a C program to find the eligibility of admission for a professional course based on the following criteria:
 /*Marks in Maths >=65
Marks in Phy >=55
Marks in Chem>=50
Total in all three subject >=180
or
Total in Math and Subjects >=140 */

import java.util.*;

class Assignment_feb_13{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the mark in math");
int m= sc.nextInt();
System.out.println("Enter the mark in physics ");
int p= sc.nextInt();
System.out.println("Enter the mark in chemistry");
int c= sc.nextInt();

if(m>=65 && p>=55 && c>=50)
{
	if((m+p+c)>=180 || (m+p)>=140)
	{
		System.out.println(" you are eligible for admision");
		}
	else{
		System.out.println("you are not eligible for admision");
		}

	}
	else
	{
		System.out.println("you are not eligible for admision");
		}

}
}