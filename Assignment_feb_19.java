// Write a java program to check whether a character is an alphabet, digit or special character.

// Write a C program to check whether a character is an alphabet, digit or special character.
import java.util.*;

class Assignment_feb_19{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter any charecter");
char ch = sc.next().charAt(0);

 if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is A DIGIT.");

        } else {

             System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }

  }