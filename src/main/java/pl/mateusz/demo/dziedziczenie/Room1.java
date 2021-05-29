package pl.mateusz.demo.dziedziczenie;

import javax.persistence.Entity;

@Entity
public class Room1 extends Room {
    private boolean seatsVip;

    public Room1(int numberOfSeats, String specialEffects, boolean seatsVip) {
        super(numberOfSeats, specialEffects);
        this.seatsVip = seatsVip;
    }
    Room1(){

    }
}
