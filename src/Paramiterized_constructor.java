 class Paramiterized_constructor {
            int x,y;
    Paramiterized_constructor(int a,int b){

        x=a;
        y=b;
    }
    void show(){

        System.out.println(x);
        System.out.println(y);

    }
}
class test1{

    public static void main(String[] args) {

        Paramiterized_constructor c= new Paramiterized_constructor(100,200);
        c.show(); 
    }
}
