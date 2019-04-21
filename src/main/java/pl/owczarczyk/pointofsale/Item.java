package pl.owczarczyk.pointofsale;

public class Item {
    private float price;
    private String name;

    public Item(float price, String name) {
        this.price = price;
        this.name = name;   
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
