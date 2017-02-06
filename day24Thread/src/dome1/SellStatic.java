package dome1;

public  class  SellStatic implements Runnable {
    private static int ticket = 200;

    @Override
    public  void  run() {
        while (true) {
            sell();
        }
    }

    public synchronized void sell() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName()+"出售第："+ticket+"张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket -= 1;
        }
    }

}
