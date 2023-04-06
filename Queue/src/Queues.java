 class Queue {
  int size=2;
  int queue[]=new int[size];
  int begin,end;

     public Queue() {
         begin= -1;
         end=-1;

     }
     boolean isfull() {
         if (begin == 0 && end == size - 1) {
             return true;
         } else {
             return false;
         }
     }
         boolean isEmpty(){

             if (begin==-1){
                 return true;
             }
             else {
                 return false;
             }
         }

         void Enqueue(int element){

         if (isfull()){
             System.out.println("Queue is full");
         }
         else {
           //  if(begin== -1){
                 begin=0;
           //  }
             end++;
             queue[end]=element;
             System.out.println("inserted :"+element);
         }
         }

//         void DEqueue(){
//         if (isfull() )
//         }


 }

public class Queues{

    public static void main(String[] args) {
        Queue a = new Queue();
        boolean c= a.isfull();
        System.out.println("Queue bhara hai kya "+c);
        boolean v=a.isEmpty();
        System.out.println("Queue khali hai kya "+v);

        a.Enqueue(2);
        a.Enqueue(3);
        a.Enqueue(3);

    }
}
