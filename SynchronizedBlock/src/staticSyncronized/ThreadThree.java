package staticSyncronized;

public class ThreadThree extends Thread{
    @Override
    public void run() {
        Table.printTable(3);
    }
}
