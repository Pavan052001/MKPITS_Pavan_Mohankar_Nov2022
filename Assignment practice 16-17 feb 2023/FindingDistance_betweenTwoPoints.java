import java.util.Scanner;

public class FindingDistance_betweenTwoPoints {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Initial Distance =");
        int Initial_Distance= sc.nextInt();

        System.out.println("final Distance =");
        int final_distance=sc.nextInt();

        int Distance_between_two_points =final_distance-Initial_Distance;

        System.out.println("Distance between Initial Distance and final Distance is ="+Distance_between_two_points);

    }
}
