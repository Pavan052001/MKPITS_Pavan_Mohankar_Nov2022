import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        int a = System.in.read();
//        char c = (char) a;
//        System.out.println(c);
//        String name ="Doremon";
//        String n1 = String.format("name is %s",name);
//        System.out.println(n1);
//
//        String n2 =String.format("%x",101);
//        System.out.println(n2);

        //////////////////////////////////////////////

        FileName fileName = new FileName("pavan",12);

       // ObjectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
       ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.txt"));
       FileName f= (FileName) objectInputStream.readObject();
    }
}

