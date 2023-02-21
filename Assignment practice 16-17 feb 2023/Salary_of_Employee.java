import java.util.Scanner;

public class Salary_of_Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int Id = sc.nextInt();

        System.out.println("Enter Total_work_hours=");
        int Total_work_hours = sc.nextInt();

        System.out.println("Enter amount_of_work_per_hour=");
        int amount_of_work_per_hour = sc.nextInt();

        int salary =amount_of_work_per_hour*Total_work_hours;
        System.out.println("salary of employee ="+salary);

    }
}
