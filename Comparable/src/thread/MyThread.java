package thread;

public class MyThread extends Thread{
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if(i%2==0){
                        System.out.println(i);
                    }

                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if(i%2!=0){
                        System.out.println(i);
                    }

                }
            }
        }).start();

    }
}
