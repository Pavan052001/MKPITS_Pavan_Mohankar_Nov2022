

import java.util.*;

class factorial_of_number{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();


long factorial =1;

for(int i=1;i<=n;i++){

factorial=factorial*i;

}
System.out.println(factorial);



}

}