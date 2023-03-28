//Musician interface and guitar and drums classes:
//        Create an interface called Musician that has two abstract methods:
//        playInstrument() and sing(). Then create two classes called Guitarist and
//        Drummer that implement the Musician interface. The Guitarist class should
//have an instance variable for the guitar's brand, and the Drummer class should
//        have an instance variable for the drum's size. Implement the playInstrument()
//        and sing() methods for each class.

interface  Musician{
    void playInstrument();
    void sing();
}
class Guitarist implements Musician{
    public  String guitars_brand= "";
    @Override
    public void playInstrument() {
        System.out.println("play guitars");
    }

    @Override
    public void sing() {
        System.out.println("play dum");
    }
}
class Drummer implements Musician{
        public  String drum_size ="";
    @Override
    public void playInstrument() {
        System.out.println("play guitar");
    }

    @Override
    public void sing() {
        System.out.println("sing a song");
    }
}
public class Interface_Assignment06 {
    public static void main(String[] args) {

    Guitarist g = new Guitarist();
    g.playInstrument();
    g.sing();
     Drummer d= new Drummer();
     d.playInstrument();
     d.sing();

}
}
