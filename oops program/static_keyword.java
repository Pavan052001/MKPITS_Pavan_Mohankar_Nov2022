// Program to demonstrate the use of static variables and methods in Java.

class Student{
    int rollno;
    String name;
    static String college ="ITS";
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }

    void display ()
    {System.out.println(rollno+" "+name+" "+college);}}
public class static_keyword{
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");


        //Student.college="BBDIT";
        s1.display();

    }
}


