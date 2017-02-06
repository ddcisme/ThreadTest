package dome4;

public class Shop {
    //余票
    private int ticket=10;
    private int chair=10;
    //总共有过的票数
    private int allTicket=10;
    
    public int getAllTicket() {
        return allTicket;
    }
    public void setAllTicket(int allTicket) {
        this.allTicket = allTicket;
    }
    public int getTicket() {
        return ticket;
    }
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    public int getChair() {
        return chair;
    }
    public void setChair(int chair) {
        this.chair = chair;
    }
}
