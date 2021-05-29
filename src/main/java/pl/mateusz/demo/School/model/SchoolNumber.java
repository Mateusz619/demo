package pl.mateusz.demo.School.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SchoolNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int number;

    public SchoolNumber(int number) {
        this.number = number;
    }

}
