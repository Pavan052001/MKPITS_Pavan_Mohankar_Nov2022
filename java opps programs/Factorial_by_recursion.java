
class c{
public int factorial(int n) {
 if (n<0) {
 return -1;
 }
 if (n == 0 || n == 1) {
 return 1;
 }
 return n * factorial(n-1);
 }

}
class Factorial_by_recursion{
 public static void main(String[] args){

	 int n=5;
	 c f= new c();
	 System.out.println(f.factorial(5));

 }
}