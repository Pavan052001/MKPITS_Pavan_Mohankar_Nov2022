import java.util.Scanner;

public class ItemWeight {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Weight of first Item");
        float first_Item = sc.nextFloat();

        System.out.println("Weight of second Item");
        float second_Item = sc.nextFloat();

        float avg = (first_Item+second_Item)/2;
        System.out.println(+avg);

    }
}
