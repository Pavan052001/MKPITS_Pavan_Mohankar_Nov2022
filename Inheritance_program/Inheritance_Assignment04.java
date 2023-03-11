//Create a parent class called "Person" with two child classes "Student" and "Teacher".
//        Each child class should have its own unique method.

class Person{
    void work_as(){
        System.out.println("every person has a its own work");
    }
}
class student extends  Person{

    void gain_knowlage(){
        System.out.println("students are aquire knowlage in school");
    }
}
class teacher extends student{
    void knowlage(){
        System.out.println("teacher serving knowlage");
    }
}
public class Inheritance_Assignment04 {
    public static void main(String[] args) {


      //  teacher obj = new teacher();
        student obj1 = new student();
        obj1.work_as();
    }
}
