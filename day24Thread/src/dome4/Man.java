package dome4;

public class Man {
    private int ticket=0;
    private int chair=0;
    
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
    
    public void buyTicket(){
        ticket++;
    }
    public void buyChair(){
        chair++;
    }
    
}
