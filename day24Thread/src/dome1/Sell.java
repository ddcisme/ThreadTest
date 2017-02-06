package dome1;

public class Sell implements Runnable {
    private  int ticket = 200;

    @Override
    public void run() {
        while (true) {
            
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName()+"出售第："+ticket+"张票");
                ticket -= 1;
            }
            
        }
    }

}
