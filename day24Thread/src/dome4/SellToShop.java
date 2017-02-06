package dome4;

public class SellToShop implements Runnable{
    private Factory factory;
    private Shop shop;
    
    public SellToShop(Factory factory, Shop shop) {
        super();
        this.factory = factory;
        this.shop = shop;
    }

    @Override
    public void run() {
        while(true){
            synchronized (factory) {
                if(factory.getTicket()==0){
                    try {
                        factory.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
                factory.setTicket(factory.getTicket()-1);
                synchronized (shop) {
                    shop.setTicket(shop.getTicket()+1);
                    shop.setAllTicket(shop.getAllTicket()+1);
                    shop.notify();
                }
                System.out.println(Thread.currentThread().getName()+"已有票"+shop.getTicket()+"张");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
