public class BasicRecursion {
    public static void main(String[] args) {
        printNum(1);

    }
    public static void printNum(int number){
        if(number==5){
            System.out.println(number);
            return;
        }
        System.out.println(number);
        printNum(number+1);

    }
}
