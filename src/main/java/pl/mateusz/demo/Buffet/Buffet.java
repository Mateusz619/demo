package pl.mateusz.demo.Buffet;

import javax.persistence.*;
import java.util.List;

@Entity
public class Buffet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    public String accessoriesStore;
    public String snacks;
    public String drinks;

//    @OneToOne
//    public Cinema cinema;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name= "buffet_id")
    private List<Cinema> cinema;

    public Buffet(List<Cinema> cinema) {
        this.cinema = cinema;
    }

    public Buffet(String snacks, String drinks) {
//        this.accessoriesStore = accessoriesStore;
        this.snacks = snacks;
        this.drinks = drinks;
    }
    public Buffet(){

    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public List<Cinema> getCinema() {
        return cinema;
    }

    public void setCinema(List<Cinema> cinema) {
        this.cinema = cinema;
    }

    //    public void setCinema(Cinema cinema) {
//        this.cinema = cinema;
//    }
}
