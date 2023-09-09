package staticSyncronized;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        Table.printTable(2);
    }
}
