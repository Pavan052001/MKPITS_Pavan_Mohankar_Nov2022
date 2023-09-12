package main;

import main.A;
import main.B;

import java.util.Scanner;

public class C implements A, B {

Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        System.out.println("enter choice :");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                 A.super.display();
                break;
            case 2:
                B.super.display();
                break;
            default:
                System.out.println("not valid choice !!!!");
        }
    }
}
