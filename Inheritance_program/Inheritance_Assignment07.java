//Create a class called "Employee" with two child classes "Manager" and "Developer".
//        Each child class should have its own unique method.

class Employee{

}
class manager extends  Employee{
    void work_of_manager(){
        System.out.println("manage all works");
    }
}
class devloper extends  manager{

    void devloper_works(){
        System.out.println("devloper are making apps");
    }
}
public class Inheritance_Assignment07 {
    public static void main(String[] args) {
        devloper ob  =  new devloper();
        ob.work_of_manager();
    }
}
