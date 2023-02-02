
class one1{

 synchronized void dis(String sc){
System.out.print("[ hellow"+sc);

try{  Thread.sleep(1000);}
catch(Exception e){}
System.out.println("]");
}
}

class two implements Runnable
{

Thread t;
String s;
one1 sos;

 two(one1 bob,String tom)
 {
 t =new Thread(this);
 sos=bob;
 s=tom;
 t.start();
 }
 public void run(){
	 sos.dis(s);

	 }
}



public class synchro_example{

public static void main(String[] args){


one1 ob =new one1();
two ob2 =new two(ob,"rudra");
two ob3 =new two(ob,"ansh");


}
}