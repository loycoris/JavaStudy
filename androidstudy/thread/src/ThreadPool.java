import org.junit.Test;

import java.util.Date;
import java.util.concurrent.*;

public class ThreadPool {
    @Test
    public void testQueue() {
//        SynchronousQueue<Runnable> queue = new SynchronousQueue<>();
//        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);

        /*ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(0,
                Integer.MAX_VALUE, 60, TimeUnit.SECONDS, queue);

        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务1: " + Thread.currentThread());
                while (true) {
//                    System.out.println("任务11: " + Thread.currentThread());
                }
            }
        });

        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务2: " + Thread.currentThread());
            }
        });

        while (true) {

        }*/

        ThreadPoolExecutor pool = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        pool.allowCoreThreadTimeOut(true);
        System.out.println("test start           " + new Date() + "   " + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 6; i++) {
                pool.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("work start           " + new Date() + "   " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(5000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("work end             " + new Date() + "   " + Thread.currentThread().getName());
                    }
                });
            }
            Thread.sleep(3000);
            System.out.println("。。。。。。。。。。。1  " + new Date() + "  " + pool.getActiveCount());
            System.out.println("。。。。。。。。。。。1  " + new Date() + "  " + pool.getPoolSize());
            System.out.println("。。。。。。。。。。。1  " + new Date() + "  " + pool.getTaskCount());
            System.out.println("。。。。。。。。。。。1  " + new Date() + "  " + pool.getQueue().size());
            System.out.println("。。。。。。。。。。。1  " + new Date() + "  ");
            Thread.sleep(4000);
            System.out.println("。。。。。。。。。。。2  " + new Date() + "  " + pool.getActiveCount());
            System.out.println("。。。。。。。。。。。2  " + new Date() + "  " + pool.getPoolSize());
            System.out.println("。。。。。。。。。。。2  " + new Date() + "  " + pool.getTaskCount());
            System.out.println("。。。。。。。。。。。2  " + new Date() + "  " + pool.getQueue().size());
            System.out.println("。。。。。。。。。。。2  " + new Date() + "  ");
            Thread.sleep(20000);
            System.out.println("。。。。。。。。。。。3  " + new Date() + "  " + pool.getActiveCount());
            System.out.println("。。。。。。。。。。。3  " + new Date() + "  " + pool.getPoolSize());
            System.out.println("。。。。。。。。。。。3  " + new Date() + "  " + pool.getTaskCount());
            System.out.println("。。。。。。。。。。。3  " + new Date() + "  " + pool.getQueue().size());
            System.out.println("。。。。。。。。。。。3  ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
