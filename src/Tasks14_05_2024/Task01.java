package Tasks14_05_2024;

/*
Два охранника попеременно стоят на посту по 12 часов.
Пока один стоит на посту, другой спит.
У обоих охранников имеются наручные часы. Охранник на посту сверяется со временем,
будит в нужный момент спящего и сам засыпает.
Процесс повторяется.
Должны быть классы Guard, Watch
 */


public class Task01 {
    public static void main(String[] args) {
        Guard guard1 = new Guard();
        Guard guard2 = new Guard();

        Thread thread1 = new Thread(guard1);
        Thread thread2 = new Thread(guard2);

        thread1.start();

        thread2.start();
    }

    static class Guard implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 12; i++) {
                System.out.println("First guard is active for " + i + " hour.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void firstGuard() {
            System.out.println("First guard is active for ");
        }
    }

    static class Watch {
        private volatile boolean timer;
    }
}