interface one{

void one();

}
class two implements one
{
 public void one(){

System.out.println("1");

}

}


public class interface_demo{

public static void main(String[] args){
  two ob=new two();
  ob.one();
}

}