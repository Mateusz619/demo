package pl.mateusz.demo;

public class CinemaReq {
    public String place;
    public int ticketPrice;

    public CinemaReq(String place, int ticketPrice) {
        this.place = place;
        this.ticketPrice = ticketPrice;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "CinemaReq{" +
                "place='" + place + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
