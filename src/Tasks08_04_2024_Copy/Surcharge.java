package Tasks08_04_2024_Copy;

public class Surcharge extends Base {
    public double coefficient;

    public Surcharge(String category, String name, double coefficient) {
        super(category, name);
        this.coefficient = coefficient;
    }

    public String toString() {
        return this.category + " " + this.name + " " + this.coefficient;
    }

    public double getPrice(Product product) {
        return product.getPrice() * this.coefficient;
    }
}
