
class a{


    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        a obj= new a();
        obj.setValue(100);
        System.out.println("getting value of a outside class"+obj.getValue());

    }
}
