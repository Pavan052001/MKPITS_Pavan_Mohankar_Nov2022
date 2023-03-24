//Create a class called "BankAccount" that has a balance field and a method to deposit money
//        into the account. Create two child classes "CheckingAccount" and "SavingsAccount" that
//        inherit from it.

class BankAccount11{
    int balance;
    void deposite1_money(){
        System.out.println("create account");
    }

}
class SavingAccount1 extends BankAccount11{

    void save(){
        System.out.println("create saving account");
    }
}

public class Inheritance_Assignment05 {
    public static void main(String[] args) {
        SavingAccount1 obj = new SavingAccount1();
        obj.deposite1_money();
    }
}
