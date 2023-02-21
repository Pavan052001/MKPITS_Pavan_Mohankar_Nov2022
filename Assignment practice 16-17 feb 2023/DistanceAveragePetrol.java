import java.util.Scanner;

public class DistanceAveragePetrol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km");
        int distance = sc.nextInt();

        System.out.println("Enter petrol in liters in one liters");
        int petrol=sc.nextInt();

        int Distance_Average =distance/petrol;

        System.out.println("Average distance"+Distance_Average);
    }
}
