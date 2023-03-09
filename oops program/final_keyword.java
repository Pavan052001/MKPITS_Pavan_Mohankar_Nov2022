// Program to demonstrate the use of the final keyword in Java
class abc{

    final void alphabets(){

        System.out.println("abc are english alphabets");
    }
}           // we cannot override final keyword method
class def extends  abc{

    void alphabets1(){
        System.out.println("def also english alphabets");
    }
}

public class final_keyword {

    public static void main(String[] args) {

        def a= new def();
        a.alphabets1();
    }
}
