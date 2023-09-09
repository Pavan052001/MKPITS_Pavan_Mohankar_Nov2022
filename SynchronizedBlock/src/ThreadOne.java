 class ThreadOne extends Thread {
    Table t;
    ThreadOne(Table t){
        this.t = t;
    }

     @Override
     public void run() {
         t.printTable(4);
     }
 }
