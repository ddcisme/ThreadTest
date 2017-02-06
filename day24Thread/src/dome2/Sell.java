package dome2;

public class Sell implements Runnable {
    private  int ticket = 200;
    private Object ob=new Object();
    @Override
    public void run() {
        while (true) {
            
            if (ticket > 0) {
                if(ticket%2==0){
                    synchronized (this) {
                        synchronized (ob) {
                            System.out.println(Thread.currentThread().getName()+"出售第："+ticket+"张票");
                            ticket -= 1;
                        }
                    }
                }else{
                    synchronized (ob) {
                        synchronized (this) {
                            System.out.println(Thread.currentThread().getName()+"出售第："+ticket+"张票");
                            ticket -= 1;
                        }
                    }
                }
            }
        }
    }

}
