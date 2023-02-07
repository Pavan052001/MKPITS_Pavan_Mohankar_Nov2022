 /*Write a C program to read temperature in centigrade and display a suitable message according to temperature state below :
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot */

import java.util.*;
class Assignment_feb_16{

public static void main(String[] args)
{
 Scanner cs=new Scanner(System.in);
 System.out.println("Enter the Temperature");
 int t=cs.nextInt();

 if(t<0)
 {
	 System.out.println("Freezing weather");
	 }
 else if(t>0  && t<=10)
 {
	 System.out.println("Very Cold weather");
	 }
 else if(t>10 && t<=20)
 {
	 System.out.println("Cold weather");
	 }
 else if(t>20 && t<=30)
 {
	 System.out.println("Normal in Temp");
	 }
 else if(t>30 && t<=40)
 {
	 System.out.println("Its Hot");
	 }


}
}