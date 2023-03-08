//parent class
class Student
{
public void methodStudent()
{
System.out.println(" hello.");
}
}
class Science extends Student
{
public void methodScience()
{
System.out.println("hiiii.");
}
}
class Commerce extends Student
{
public void methodCommerce()
{
System.out.println("bye.");
}
}
class Arts extends Student
{
public void methodArts()
{
System.out.println("bye.");
}
}
public class inheritancehierarchical
{
public static void main(String args[])
{
Science sci = new Science();
Commerce comm = new Commerce();
Arts art = new Arts();
//all the sub classes can access the method of super class
sci.methodStudent();
comm.methodStudent();
art.methodStudent();
}
}