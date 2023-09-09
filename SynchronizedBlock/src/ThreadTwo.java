 class ThreadTwo extends Thread {
    Table t;
    ThreadTwo(Table t){
        this.t= t;
    }

     @Override
     public void run() {
         t.printTable(3);
     }
 }
