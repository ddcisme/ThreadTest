package dome1;

import org.junit.Test;

//看看多线程在static成员变量和非static上的区别
//结果一样
public class Main {
    @Test
    public void test1() {
        Sell sell=new Sell();
        Thread thread1 =new Thread(sell);
        Thread thread2 =new Thread(sell);
        thread1.start();
        thread2.start();
        
    }
    public static void main(String[] args) {
        SellStatic sell=new SellStatic();
        //开始
        Thread thread1 =new Thread(sell,"黄日天");
        System.out.println(thread1);
        Thread thread2 =new Thread(sell,"赵怼地");
        thread1.start();
        thread2.start();
        
    }
}
