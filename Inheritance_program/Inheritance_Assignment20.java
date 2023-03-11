//Create a class called "Employee" with two child classes "Manager" and "Clerk".
//        Each child class should have its own unique method

class worker{
    void worker_type(){

    }
}
class manager1 extends  worker{

    void manage_work(){

        System.out.println("manage work in company");
    }
}
class cleark extends manager1{

    void serve(){
        System.out.println("serving tea coffee");
    }
}

public class Inheritance_Assignment20 {
    public static void main(String[] args) {
        cleark c = new cleark();
        c.serve();
        c.manage_work();
    }
}
