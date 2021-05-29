package pl.mateusz.demo.Buffet;

import javax.persistence.Embeddable;

@Embeddable
public class AccessoriesStore {
    public int price;
    public String accessories;

    public AccessoriesStore(int price, String accessories) {
        this.price = price;
        this.accessories = accessories;
    }
    public AccessoriesStore(){

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }
}
