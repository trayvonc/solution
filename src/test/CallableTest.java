package test;

import java.util.concurrent.*;

public class CallableTest {
    // 创建线程池
    private static final ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        // 创建task
        Callable task = () -> {
            System.out.println("Thread name [" + Thread.currentThread().getName() + "]");
            System.out.println("task running ......");
            try {
                Thread.sleep(1000 * 5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("task end ......");
            return "call return";
        };

        Future result = executorService.submit(task);

        while(!result.isDone()) {
            System.out.println("waiting task end ......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println("thread end, return : " + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
