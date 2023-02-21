import java.util.Scanner;

public class Enteger_converts_year_months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        int days = sc.nextInt();

        int year;
        int months;
        int day;

        year = days / 365;
        days=days%365;
        day = days % 365;

        months = days / 30;
        day=days%30;


        System.out.println(year + " year " + months + " months " + day + " day");

    }
}
