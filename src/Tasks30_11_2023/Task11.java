package Tasks30_11_2023;

public class Task11 {
    public static void main(String[] args) {
        int givenTime = 1757845; // in seconds
        int theWholeDays = givenTime / 3600 / 24;
        int remainingSecondsOfDays = givenTime - theWholeDays * 3600 * 24;
        int theWholeHours = remainingSecondsOfDays / 3600;
        int remainingSecondsOfHours = remainingSecondsOfDays - theWholeHours * 3600;
        int theWholeMinutes = remainingSecondsOfHours / 60;
        int remainingSecondsOfMinutes = remainingSecondsOfHours - theWholeMinutes * 60;
        System.out.println(theWholeDays + " days, " + theWholeHours + " hours, " + theWholeMinutes + " minutes, " + remainingSecondsOfMinutes + " seconds.");
    }
}

