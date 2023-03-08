
//Geometric series
  //      5  10 20 40 80 160  ……..n

import java.sql.SQLOutput;
import java.util.Scanner;

public class Geomatric_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth number");
        int n= sc.nextInt();
        for (int i = 5; i <n ; i=2*i) {
            System.out.println(i);
        }
    }
}
