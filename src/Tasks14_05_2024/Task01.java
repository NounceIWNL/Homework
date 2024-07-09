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
    static volatile boolean firstGuardIsOnDuty;
    static volatile boolean secondGuardIsOnDuty;
    public static void main(String[] args) throws InterruptedException {
        Watch watch = new Watch();
        Thread thread3 = new Thread(watch);


        Guard guard1 = new Guard("Guard 1");
        Thread thread1 = new Thread(guard1);
        thread1.start();
//      thread1.join();

        thread3.start();
        thread3.join();

        Guard guard2 = new Guard("Guard 2");
        Thread thread2 = new Thread(guard2);
        thread2.start();


    }

    static class Guard implements Runnable {
        public String guardName;

        public Guard(String guardName) {
            this.guardName = guardName;
        }

        @Override
        public void run() {
            guardIsActive(true);
        }

        public void guardIsActive(boolean check) {
            if (check) {
                System.out.println(this.guardName + " is active for ");
            } else
                guardIsAsleep(true);
        }

        public void guardIsAsleep(boolean check) {
            if (check) {
                System.out.println(this.guardName + " is asleep for ");
            }
        }
    }

    static class Watch implements Runnable {

        @Override
        public void run() {
            int i = 1;
            do {
                System.out.println(i + " hour");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
                if (i == 13) {
                    i = 1;
                }
            } while (true);
        }
    }
}