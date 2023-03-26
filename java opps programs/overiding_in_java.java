
class bike{


    void run(){

        System.out.println("super bike so fast");
    }
}
class bmw extends  bike{

    @Override
    void run() {
        System.out.println("bmw speed like a rocket");
    }
}


public class overiding_in_java {

    public static void main(String[] args) {

        bmw a= new bmw();
        a.run();
    }
}
