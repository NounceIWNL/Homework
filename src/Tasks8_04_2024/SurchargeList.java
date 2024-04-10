package Tasks8_04_2024;

public class SurchargeList extends OptionDecorator {
    public SurchargeList(Details details, double price) {
        super(details, price);
    }

    @Override
    public String toString(){
        return ""+ price;
    }
}
