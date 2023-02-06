// Write a C program to accept the height of a person in centimeter and categorize the person according to their height.

import java.util.*;

class Assignment_feb_11{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the person height in centi-meters");
int height=sc.nextInt();


if(height<150)
{
System.out.println("the person is Dwarf");
}
else if((height>=150)&& (height<=165))
{
System.out.println("the person is medium");
}
else if((height>=165) && (height<=195))
{
System.out.println("the person is tall");
}
else
{
System.out.println("the person height is abnormal");
}
}
}
/*if (PerHeight < 150.0)
        printf("The person is Dwarf. \n");
    else if ((PerHeight >= 150.0) && (PerHeight < 165.0))
        printf("The person is  average heighted. \n");
    else if ((PerHeight >= 165.0) && (PerHeight <= 195.0))
        printf("The person is taller. \n");
    else
        printf("Abnormal height.\n"); */