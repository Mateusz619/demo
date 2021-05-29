package pl.mateusz.demo.dziedziczenie;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private int numberOfSeats;
    private String specialEffects;

    public Room(int numberOfSeats, String specialEffects) {
        this.numberOfSeats = numberOfSeats;
        this.specialEffects = specialEffects;
    }

    public Room() {
    }
}
