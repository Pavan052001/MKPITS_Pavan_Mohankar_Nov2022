package threadingQuestions;

 class PrintName {
     void printName(String name){

         synchronized (this){
             for (int i = 1; i <5 ; i++) {
                 System.out.println(name);

             }
         }

     }
     void addition(){
         int a=10;
         int b = 1;
         int c=a+b;
         System.out.println(c);
     }

}
