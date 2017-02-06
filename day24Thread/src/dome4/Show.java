package dome4;

import java.util.TimerTask;

//显示个个对象的信息haha
public class Show extends TimerTask {
    //要显示的对象
    private Object[] obs;
    @Override
    public void run() {
            for(Object x:obs){
                if(x instanceof Factory){
                    System.out.println("已经生产"+((Factory) x).getAllTicket());
                }else if(x instanceof Man){
                    System.out.println("-----------");
                    System.out.println("man有"+((Man) x).getTicket());
                    System.out.println("-----------");
                }else{
                    System.out.println("商店路过"+((Shop) x).getAllTicket());
                }
            }
    }
    
    public void set(Object ... obs){
        this.obs=obs;
    }
}
