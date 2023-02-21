import java.util.Scanner;

public class made_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side a");
        float a=sc.nextFloat();

        System.out.println("Enter side b");
        float b = sc.nextFloat();

        System.out.println("Enter side c");
        float c = sc.nextFloat();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("its a triangle");
        }
        float p = a+b+c;
        System.out.println("perimeter of triangle is ="+p);
    }
}
