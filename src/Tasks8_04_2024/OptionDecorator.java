package Tasks8_04_2024;

public class OptionDecorator implements Details{
    protected final Details details;
    protected final double price;

    public OptionDecorator(Details details, double price) {
        this.details = details;
        this.price = price;
    }

    @Override
    public double purchasePrice() {
        return this.price + details.purchasePrice();
    }
}
