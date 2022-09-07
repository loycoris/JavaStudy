import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Alipay {
    private Lock alipayLock;
    private double[] accounts;
    private Condition condition;
    private Object lock = new Object();

    public Alipay(int n, double money) {
        accounts = new double[n];
        alipayLock = new ReentrantLock();
        //得到条件对象
        condition = alipayLock.newCondition();
        for (int i = 0; i < n; i++) {
            accounts[i] = money;
        }
    }

    //使用锁
    /*public void transfer(int from, int to, int amount) throws InterruptedException {
        alipayLock.lock();
        try {
            while (accounts[from] < amount) {
                System.out.println("await");
                condition.await();
            }

            accounts[from] = accounts[from] - amount;
            accounts[to] = accounts[to] + amount;
            condition.signalAll();
            System.out.println("transfer");
        } finally {
            alipayLock.unlock();
        }

    }*/

    //同步方法
    public synchronized void transfer(int from, int to, int amount) throws InterruptedException {
        while (accounts[from] < amount) {
            System.out.println("wait");
            wait();
        }

        accounts[from] = accounts[from] - amount;
        accounts[to] = accounts[to] + amount;
        notifyAll();
        System.out.println("transfer");
    }

    //同步代码块
    public void transfer1(int from, int to, int amount) throws InterruptedException {
        while (accounts[from] < amount) {
            System.out.println("wait");
            wait();
        }

        synchronized (lock) {
            accounts[from] = accounts[from] - amount;
            accounts[to] = accounts[to] + amount;
        }
        notifyAll();
        System.out.println("transfer");
    }
}
