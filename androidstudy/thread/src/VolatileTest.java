import sun.awt.windows.ThemeReader;

public class VolatileTest {
    //volatile保证可见性，不保证原子性
    public volatile int inc = 0;

    //自增自减都不是原子性操作
    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        test.increase();
                    }
                }
            }.start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(test.inc);
    }

}
