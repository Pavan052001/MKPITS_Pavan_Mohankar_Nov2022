package threadingQuestions;

 class ThreadOne extends Thread{
     PrintName printName;
     ThreadOne(PrintName printName){
         this.printName=printName;

     }

     @Override
     public void run() {
         printName.addition();
         printName.printName("the hulk");
     }
 }
