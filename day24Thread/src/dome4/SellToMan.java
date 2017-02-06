package dome4;

public class SellToMan implements Runnable {
    private Man man;
    private Shop shop;
    
    public SellToMan( Man man, Shop shop) {
        super();
        this.man = man;
        this.shop = shop;
    }
    
    @Override
    public void run() {
        while(true){
            synchronized (shop) {
                if(shop.getTicket()==0){
                    try {
                        shop.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    man.buyTicket();
                    shop.setTicket(shop.getTicket()-1);
                    System.out.println(Thread.currentThread().getName()+"已有票"+man.getTicket()+"张");
                
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

}
