//Write a program in C to accept a grade and declare the equivalent description.
//Grade Description E Excellent V Very Good G Good A Average F Fail

import java.util.*;

class Assignment_feb_23{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Grade =");
char grade=sc.next().charAt(0);


switch(grade) {
    case E:
    System.out.println("Excellent");
    break;
    case V:
    System.out.println("Very Good");
    break;
    case G:
    System.out.println("Good");
    break;
    case A:
    System.out.println("Average");
    case F:
    System.out.println("Fail");
  default:
    System.out.println("No grade found");
}


}
}