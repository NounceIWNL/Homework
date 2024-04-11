package Tasks08_04_2024_Copy;

public class Product extends Base {
    public double price;

    public Product(String category, String name, double price) {
        super(category, name);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.category + " " + this.name + " " + this.price;
    }
}
