package pl.mateusz.demo.dziedziczenie2;

import javax.persistence.Entity;

@Entity
public class ToiletForWomen extends Toilet{
    private String moreCabins;

    public ToiletForWomen(String sink, String cabin, String moreCabins) {
        super(sink, cabin);
        this.moreCabins = moreCabins;
    }
    public ToiletForWomen(){

    }
}
