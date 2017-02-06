package dome4;
//生产
public class Product implements Runnable {
    private Factory factory;
    private boolean status=true;
    public Product(Factory factory) {
        super();
        this.factory = factory;
    }
    
    @Override
    public void run() {
        while(status){
            factory.factory();
            
            System.out.println(Thread.currentThread().getName()+"票"+factory.getTicket()+"张");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //生产了51个后停止生产
            if(factory.getAllTicket()>50){
                status=false;
            }
        }
    }

}
