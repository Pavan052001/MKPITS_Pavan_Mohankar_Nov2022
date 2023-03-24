//Create a class called "BankAccount" that has a balance field and a method to withdraw
//        money from the account. Create two child classes "CheckingAccount" and "SavingsAccount"
//        that inherit from it.

class Account1{
    int balance=10000;

    void widthdraw(){
        System.out.println("available balance :"+balance);
    }
}
class check_acc extends Account1{

    void mybalances(){

        System.out.println("balance");
    }
}
class saving_acc extends Account1{

    void save(){
        System.out.println("saving money :"+ balance);
    }
}
public class Inheritance_Assignment24 {
    public static void main(String[] args) {
        saving_acc s = new saving_acc();
        s.save();
    }
}
