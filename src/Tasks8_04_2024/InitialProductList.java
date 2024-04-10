package Tasks8_04_2024;

public class InitialProductList implements Details {
    protected final String name;
    protected double price;

    public InitialProductList(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + price;
    }

    @Override
    public double purchasePrice() {
        return this.price;
    }
}
