
//Write a C programming Write a program that reads in a five-digit integer and
//        determines whether or not it’s a palindrome.

public class five_number_palindrom_or_not {

    public static void main(String[] args) {

        int n=12321;
        int temp=0;
        temp=n;
       int rev=0;

        while(n!=0){

            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev) {

            System.out.println("palindrom");
        }
            else{

            System.out.println("not");
        }

    }
}
