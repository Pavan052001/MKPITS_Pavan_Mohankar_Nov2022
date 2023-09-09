 abstract class AbstractClass {

    public void add(){
        int a=9;
        int b=6;
        int c= a+b;
    }

    class Child extends AbstractClass{
        @Override
        public void add() {
            super.add();
        }
    }

}

