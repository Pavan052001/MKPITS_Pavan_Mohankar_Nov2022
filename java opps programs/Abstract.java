
abstract class animal{
  public   abstract void sound();
}
class dog extends animal{

    @Override
   public void sound() {
        System.out.println("dog sound is woow woow");
    }
}

class lion extends animal{

    @Override
    public void sound() {
        System.out.println("lion is rour");
    }
}


public class Abstract{

    public static void main(String[] args) {
        dog obj = new dog();
        obj.sound();
    }
        }
