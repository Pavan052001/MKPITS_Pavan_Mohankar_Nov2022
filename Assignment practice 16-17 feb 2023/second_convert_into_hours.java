import java.util.Scanner;

public class second_convert_into_hours {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter seconds");
        int sec = sc.nextInt();

        int hour;
        int min;
        int secs;

        secs =sec%60;
        hour = sec/60;
        min=hour%60;
        hour=hour/60;

        System.out.println(hour+":"+min+":"+secs);


    }
}
