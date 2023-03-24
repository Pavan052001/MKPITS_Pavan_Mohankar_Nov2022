//Create a class called "Account" with two child classes "CheckingAccount" and "SavingsAccount".
//        Each child class should have its own unique method.

class Account{

    void create_account(){

        System.out.println("new account");
    }
}
class Checkingaccount extends Account{

    void check(){
        System.out.println("checking balance");
    }
}
class savingaccount extends Checkingaccount{

    void saving(){

        System.out.println("saving money");
    }
}
public class Inheritance_Assignment16 {
    public static void main(String[] args) {
        savingaccount ab= new savingaccount();
        ab.saving();
        ab.create_account();
        ab.check();

    }
}
