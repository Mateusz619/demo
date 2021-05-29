package pl.mateusz.demo.dziedziczenie2;

import javax.persistence.Entity;

@Entity
public class ToiletForMen extends Toilet {
    private String urinal;

    public ToiletForMen(String sink, String cabin, String urinal) {
        super(sink, cabin);
        this.urinal = urinal;
    }
    public ToiletForMen(){

    }
}
