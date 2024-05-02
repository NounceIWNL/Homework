package Tasks14_05_2024;

public class Task01 {
    public static void main(String[] args) {
        Guard guard1 = new Guard();
        Guard guard2 = new Guard();

        Thread thread1 = new Thread(guard1);
        Thread thread2 = new Thread(guard2);
    }

    static class Guard implements Runnable {

        @Override
        public void run() {

        }
    }
}