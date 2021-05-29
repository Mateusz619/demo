package pl.mateusz.demo.file;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class File {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @Lob
    byte[] binary;

    public File(String name, byte[] binary) {
        this.name = name;
        this.binary = binary;
    }

    public File() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }
}
