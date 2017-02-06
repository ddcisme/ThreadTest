package dome3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class  SellStatic extends Thread {
    private static int ticket = 200;
    private Lock lock=new ReentrantLock();
    @Override
    public  void  run() {
        while (true) {
            sell();
        }
    }

    public  void sell() {
        lock.lock();
        try {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName()+"出售第："+ticket+"张票");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket -= 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
