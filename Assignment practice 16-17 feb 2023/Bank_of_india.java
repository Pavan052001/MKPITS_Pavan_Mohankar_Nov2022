import java.util.Scanner;

public class Bank_of_india {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees");
        int rupees = sc.nextInt();

        int Smallest_notes_amount = rupees/10;
        System.out.println("notes of 10 rupees is ="+Smallest_notes_amount);
    }
}
