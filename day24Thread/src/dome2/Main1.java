package dome2;

import org.junit.Test;

//看看多线程在static成员变量和非static上的区别
//结果一样
public class Main1 {
    @Test
    public void test1() {
        Sell sell=new Sell();
        Thread thread1 =new Thread(sell);
        Thread thread2 =new Thread(sell);
        thread1.start();
        thread2.start();
        
    }
    public static void main(String[] args) {
        Sell sell=new Sell();
        Thread thread1 =new Thread(sell,"黄日天");
        Thread thread2 =new Thread(sell,"赵怼地");
        thread1.start();
        thread2.start();
        
    }
}
