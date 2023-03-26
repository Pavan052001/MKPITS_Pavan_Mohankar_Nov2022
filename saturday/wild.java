
// Program to demonstrate inheritance in Java.

class animal{

void eating(){
System.out.println("Eating grass");

}
}
class tiger extends animal{

void bark(){
System.out.println("barking");
}
}


public class wild{

public static void main(String[] args){

tiger obj=new tiger();
obj.eating();
obj.bark();

}

}