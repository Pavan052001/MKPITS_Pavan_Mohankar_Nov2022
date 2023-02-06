// Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.

import java.util.*;

class Assignment_feb_09{

public static void main(String[] args){


Scanner sc=new Scanner(System.in);
System.out.println("Enter your Age");
int Age = sc.nextInt();

if (Age>18)
     {
       System.out.println("Congratulation!, You are eligible to caste your vote.");

     }
  else{
     System.out.println("You are not eligible for casting your vote.\n");
}



}
}

