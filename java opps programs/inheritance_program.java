// Program to demonstrate inheritance in Java.

class emp{

    int salary=100;
}
class bonas extends emp{

    int work=10;
}



public class inheritance_program {
    public static void main(String[] args) {
        bonas obj = new bonas();
        System.out.println(obj.salary);
    }
}
