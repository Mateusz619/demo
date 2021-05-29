package pl.mateusz.demo.Buffet;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity(name = "CINEMA")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ToyStory", length = 555,  nullable = false, unique = false)
    private String place;
    @Column(precision = 10, scale = 9)
    private BigDecimal qwer = new BigDecimal("5.56543543543");
    @Column(nullable = false)
    private int ticketPrice;
    private LocalDateTime dateTime = LocalDateTime.now();
    @Enumerated(value = EnumType.STRING)
    private Movies movies;
//    @Embedded
//    private Buffet buffet;

    @ElementCollection
    Map<Integer,String> Drinks = new HashMap<Integer,String>() {{
    put(12,"cola");
    put(14,"fanta");
    put(16,"sprite");
    put(18,"applejuice");
    put(19,"orangejuice");
    put(10,"water");
    }};

    @OneToMany
    @JoinColumn(name = "Buffet")
    public List<Buffet> buffet;




    public Cinema(long id, String place, int ticketPrice, LocalDateTime dateTime, Movies movies, List<Buffet> buffet ) {
        this.id = id;
        this.place = place;
        this.ticketPrice = ticketPrice;
        this.dateTime = dateTime;
        this.movies = movies;
        this.buffet = buffet;
    }
    public Cinema(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
