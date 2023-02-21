import java.sql.SQLOutput;
import java.util.Scanner;

public class FindingYearByDate {
    public static void main(String[] args) {

        double year;
        double day;
        double week;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days");
        int days=sc.nextInt();

       // year =days/365;
        week = days/7;
        System.out.println(week);
        year = days/365;

        System.out.println(year);
        day=days%365;
        System.out.println(day);

    }
}
