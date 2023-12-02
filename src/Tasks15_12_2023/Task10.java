package Tasks15_12_2023;

public class Task10 {
    public static void main(String[] args) {
        double floors = 9;
        double apartmentsAmountOnOneFloor = 4;
        double apartmentNumber = 96;
        double apartmentsAmountOnOneEntrance = floors * apartmentsAmountOnOneFloor;
        double entranceNumber = Math.ceil(apartmentNumber / apartmentsAmountOnOneEntrance);
        System.out.println(Math.round(entranceNumber));
    }
}
