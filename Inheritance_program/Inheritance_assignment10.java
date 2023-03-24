//Create a class called "Person" with two child classes "Parent" and "Child".
//        Each child class should have its own unique method.
class person{
    void person(){
        System.out.println("behaviour");
    }

}
class parents extends person{
    void parents(){
        System.out.println("parent are caring");
    }
}
class child extends parents{

    void child(){
        System.out.println("children looks good");
    }
}
public class Inheritance_assignment10 {
    public static void main(String[] args) {
        child ob = new child();
        ob.parents();
    }
}
