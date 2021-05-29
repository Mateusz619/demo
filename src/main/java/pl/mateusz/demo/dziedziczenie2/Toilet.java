package pl.mateusz.demo.dziedziczenie2;

import javax.persistence.*;

@MappedSuperclass
public abstract class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sink;
    private String cabin;

    public Toilet(String sink, String cabin) {
        this.sink = sink;
        this.cabin = cabin;
    }
    public Toilet(){

    }
}
