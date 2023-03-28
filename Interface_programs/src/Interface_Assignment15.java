//Game interface and chess and checkers classes:
//        Create an interface called Game that has two abstract methods: play() and
//        getRules(). Then create two classes called Chess and Checkers that implement
//        the Game interface. The Chess class should have an instance variable for the
//        number of pieces, and the Checkers class should have an instance variable for
//        the size of the board. Implement the play() and getRules() methods for each class

interface Game{
    void play();
    void getRules();
}
class chess implements Game{
    public int number_of_pieces=32;

    @Override
    public void play() {
        System.out.println("play chess");
    }

    @Override
    public void getRules() {
        System.out.println("for win check met opponent");
    }
}
class checkers implements Game{
    public  int Size_of_board= 12;
    @Override
    public void play() {
        System.out.println("play checker");
    }

    @Override
    public void getRules() {
        System.out.println("complete game");
    }
}

public class Interface_Assignment15 {
    public static void main(String[] args) {

        chess c = new chess();
        c.play();
        c.getRules();

        checkers k = new checkers();
        k.play();
        k.getRules();
    }
}
