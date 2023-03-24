//Create a class called "Employee" with two child classes "FullTimeEmployee" and
//        "PartTimeEmployee". Each child class should have its own unique method.

class employees{

    void emp(){
        System.out.println("different emp for different section");
    }
}
class FullTimeEmployee extends  employees{

    void fulltime(){
        System.out.println("FullTimeEmployee work for permanant");
    }
}
class PartTimeEmployee extends  employees{

    void parttime(){

        System.out.println("PartTimeEmployee work for specific period of time");
    }
}
public class Inheritance_Assignment26 {
    public static void main(String[] args) {
        PartTimeEmployee pe = new PartTimeEmployee();
        pe.parttime();
        pe.emp();
    }
}
