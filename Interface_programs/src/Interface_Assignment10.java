//BankAccount interface and checking and savings classes:
//        Create an interface called BankAccount that has three abstract methods:
//        getBalance(), deposit(), and withdraw(). Then create two classes called
//        CheckingAccount and SavingsAccount that implement the BankAccount
//interface. The CheckingAccount class should have an instance variable for the
//        account's overdraft limit, and the SavingsAccount class should have an instance
//        variable for the account's interest rate. Implement the getBalance(), deposit(),
//        and withdraw() methods for each.

interface BankAccount{

    void getBalance();
    void deposit();
    void withdraw();
}
class checking_Account implements BankAccount{
    public int draft_limit=7000;
    @Override
    public void getBalance() {
        System.out.println("check bank balance");
    }

    @Override
    public void deposit() {
        System.out.println("fill deposit money form then deposite money");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw money from bank");
    }
}
class Saving_Account implements  BankAccount{
    public double interest= 10;
    @Override
    public void getBalance() {
        System.out.println("get balance inquiry");
    }

    @Override
    public void deposit() {
        System.out.println("add money in your account");
    }

    @Override
    public void withdraw() {
        System.out.println("get monet");
    }
}
public class Interface_Assignment10 {
    public static void main(String[] args) {
        checking_Account c= new checking_Account();
        c.deposit();
        c.getBalance();
        c.withdraw();
        Saving_Account a= new Saving_Account();
        a.deposit();
        a.getBalance();
        a.withdraw();
    }
}
