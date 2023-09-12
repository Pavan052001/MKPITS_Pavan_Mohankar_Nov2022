package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleCallable implements Callable<String> {
    @Override
    public String call() throws Exception {

        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <10 ; i++) {

        }
    }
}
