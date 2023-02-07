// Write a C program to calculate profit and loss on a transaction.

import java.util.*;

class Assignment_feb_21{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter cost price");
int cost= sc.nextInt();

System.out.println("Enter selling price");
int selling= sc.nextInt();


if(selling>cost)
{
int profit=selling-cost;
System.out.println("profit is ="+profit);
}
else if(cost>selling)
{
 int loss=cost-selling;
 System.out.println("loss is ="+loss);
}
else
{
 System.out.println("currently no loss & no profit");
}
}
}