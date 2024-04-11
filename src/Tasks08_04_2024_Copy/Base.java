package Tasks08_04_2024_Copy;

public class Base implements DataBase {
    public String category;
    public String name;
    public double price;

    public Base(String category, String name) {
        this.category = category;
        this.name = name;

    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.category + this.name + this.price;
    }
}
