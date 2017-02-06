package dome4;

public class Factory {
    //生产了几票
    private int allTicket=0;
    //余票
    private int ticket=0;
    private int chair=0;
    public int getAllTicket() {
        return allTicket;
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
    public void factory(){
        allTicket++;
        ticket++;
    }
}
