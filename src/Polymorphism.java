import javax.imageio.stream.ImageInputStreamImpl;

class Polymorphism {
    int age=22;
    String Name="pavan";

    public void printinfo(int age){

        age=22;
        System.out.println(age);
    }
    public void printinfo(String Name){

        System.out.println(Name);
    }

    public void printinfo(String name,int age){

        System.out.println(name+" "+age);
    }
}
 class test2{
    public static void main(String[] args) {
      Polymorphism a=new Polymorphism();

//      a.Name="pavan";
//      a.age=22;
      a.printinfo(a.age);
      a.printinfo(a.Name,a.age);
    }
}
