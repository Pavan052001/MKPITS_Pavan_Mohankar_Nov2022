import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        LinkedHashSet h2=new LinkedHashSet();
        String s=sc.nextLine();
        char[] chars=s.toCharArray();

        for (int i=0;i<s.length();i++){
           h2.add(chars[i]);



        }

        System.out.println(chars);
        System.out.println(h2);
    }
}
