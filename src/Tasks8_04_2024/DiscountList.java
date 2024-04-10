package Tasks8_04_2024;

public class DiscountList extends InitialProductList {
    public DiscountList(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
