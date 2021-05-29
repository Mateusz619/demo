package pl.mateusz.demo.dziedziczenie;

import javax.persistence.Entity;

@Entity
public class Room2 extends Room {
    private String effect3d;

    public Room2(int numberOfSeats, String specialEffects, String effect3d) {
        super(numberOfSeats, specialEffects);
        this.effect3d = effect3d;
    }
    Room2(){

    }
}
