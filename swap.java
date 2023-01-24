class assignment
{
	void disp()
	{
		System.out.print("x x+2 x+4 x+6");
		System.out.println(" ");
		System.out.println("----------------");
	}
 void fun()
 {
 for(int x =1;x<15;x=x+3)
 {

  int res1 = x+2;
  int res2 = x+4;
  int res3 = x+6;

  System.out.print(x+" ");
  System.out.print(res1+"   ");
  System.out.print(res2+"   ");
  System.out.print(res3+"   ");
 System.out.println("  ");
 }

 }
}
class Program_1
{
public static void main(String[] args)
{
 assignment ob = new assignment();
 ob.disp();
 ob.fun();

}
}