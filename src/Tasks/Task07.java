package Tasks;

public class Task07 {
    public static void main(String[] args) {
        double firstYearDeposit = 100;
        double interest = 0.05;
        double secondYearDeposit = firstYearDeposit + (firstYearDeposit * interest);
        double finalAmount = secondYearDeposit + (secondYearDeposit * interest);
        System.out.println(finalAmount);
    }
}
