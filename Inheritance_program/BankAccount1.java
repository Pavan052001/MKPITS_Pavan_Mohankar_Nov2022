//program.Create a class called "BankAccount" that has a balance field and a method to deposit money
//        into the account. Create two child classes "CheckingAccount" that
//        inherit from it.

class BankAccount{

    int balance=100;
    void Deposit_money(){
        System.out.println("money deposite");
    }
}
class CheckingAccount extends BankAccount{

    void check_account_balance(){
        System.out.println("check account minimum balence");
    }
}
class SavingsAccount extends CheckingAccount{

    void show_saving_balance(){
        System.out.println("showing saving account balance");
    }
}
public class BankAccount1 {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.show_saving_balance();
        obj.check_account_balance();
        obj.Deposit_money();

    }
}
