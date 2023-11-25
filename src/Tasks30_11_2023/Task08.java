package Tasks30_11_2023;

public class Task08 {
    public static void main(String[] args) {
        final double TIME_BETWEEN_LIGHT_AND_THUNDER = 6;
        final double SPEED_OF_SOUND = 0.34; // using km/s
        double distanceOfLightningStrike = TIME_BETWEEN_LIGHT_AND_THUNDER * SPEED_OF_SOUND;
        System.out.println(distanceOfLightningStrike);
    }
}
