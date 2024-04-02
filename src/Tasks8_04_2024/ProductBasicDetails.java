package Tasks8_04_2024;

public class ProductBasicDetails implements Details{
    protected final String name;
    protected double price;

    public ProductBasicDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public double purchasePrice() {
        return this.price;
    }
}
