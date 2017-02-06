package dome4;

import java.util.Timer;
/*有Factory,man1,man2,shop4，show 4个对象
 * factory生产票，shop从factory进货，两个man来shop买票
 * show定时查看对象信息，继承TimerTask
 * timer 为定时器对象，scheduled定时，要有个继承TimerTask的对象
 */
public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Shop shop=new Shop();
        Man man1=new Man();
        Man man2=new Man();
        
        //生产线程
        Product product=new Product(factory);
        //出售给shop
        SellToShop sellToShop=new SellToShop(factory, shop);
        //出售给man1
        SellToMan s1=new SellToMan(man1, shop);
        //出售给man1
        SellToMan s2=new SellToMan(man2, shop);
        
        Thread thread1=new Thread(product, "生产");
        Thread thread2=new Thread(sellToShop, "shop批发");
        Thread thread3=new Thread(s1, "man1购买");
        Thread thread4=new Thread(s2, "man2购买");
        Timer timer=new Timer();
        Show show=new Show();
        show.set(factory,shop,man1,man2);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        timer.schedule(show, 100,1000);
    }
}
