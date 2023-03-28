//Sports interface and basketball and football classes:
//        Create an interface called Sports that has two abstract methods: playGame() and
//        getEquipment(). Then create two classes called Basketball and Football that
//        implement the Sports interface. The Basketball class should have an instance
//        variable for the ball's size, and the Football class should have an instance
//        variable for the football's shape. Implement the playGame() and getEquipment()
//        methods for each class

interface Sports{
    void playGame();
    void getEquipment();
}
class Basketball implements Sports{
    public   int ball_size= 75;
    @Override
    public void playGame() {
        System.out.println("play grounds");
    }

    @Override
    public void getEquipment() {
        System.out.println("we need basketball to play");
    }
}
class Football implements Sports{
   public int football_size=75;
    @Override
    public void playGame() {
        System.out.println("big ground");
    }

    @Override
    public void getEquipment() {
        System.out.println("need football to play");
    }
}
public class Interface_Assignment07 {
    public static void main(String[] args) {
     Basketball b = new Basketball();
     b.getEquipment();
     b.playGame();

     Football f = new Football();
     f.getEquipment();
     f.playGame();
    }
}
