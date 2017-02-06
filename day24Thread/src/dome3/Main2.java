package dome3;


//看看多线程在static成员变量和非static上的区别
//结果一样
public class Main2 {
    public static void main(String[] args) {
        StaticAutoStop sell=new StaticAutoStop();
        Thread thread1 =new Thread(sell,"黄日天");
        Thread thread2 =new Thread(sell,"赵怼地");
        thread1.start();
        thread2.start();
        
    }
}
