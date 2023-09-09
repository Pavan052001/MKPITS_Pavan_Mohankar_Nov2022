package staticSyncronized;

 class Table {
     synchronized static void printTable(int number){

         try {
             Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName());
             for (int i = 1; i <=5 ; i++) {
                 System.out.println(i*number+", ");


             }
         }
         catch (Exception e){
             System.out.println(e);
         }
     }
}
