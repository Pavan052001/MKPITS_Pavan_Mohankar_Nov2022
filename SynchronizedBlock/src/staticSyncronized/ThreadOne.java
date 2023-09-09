package staticSyncronized;

public class ThreadOne extends Thread{
    @Override
    public void run() {

        Table.printTable(1);
    }
}
