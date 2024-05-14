package Tasks14_05_2024;

class Guard extends Thread {
    private Watch watch;
    private boolean isOnDuty;
    private int shiftDuration = 12 * 60 * 60 * 1000; // 12 часов в миллисекундах

    public Guard(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void run() {
        while (true) {
            // Заступление на пост
            System.out.println("Охранник " + getName() + " заступил на пост.");
            isOnDuty = true;
            watch.setOnDutyGuard(this);

            // Стояние на посту в течение 12 часов
            try {
                Thread.sleep(shiftDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Освобождение поста
            System.out.println("Охранник " + getName() + " освободил пост.");
            isOnDuty = false;
            watch.setOnDutyGuard(null);

            // Сон в течение 12 часов
            System.out.println("Охранник " + getName() + " спит.");
            try {
                Thread.sleep(shiftDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }
}

class Watch {
    private Guard onDutyGuard;

    public synchronized void setOnDutyGuard(Guard guard) {
        onDutyGuard = guard;
        notifyAll();
    }

    public synchronized Guard getOnDutyGuard() {
        return onDutyGuard;
    }

    public synchronized void waitForShiftChange() {
        while (onDutyGuard != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task02 {
    public static void main(String[] args) {
        Watch watch = new Watch();

        Guard guard1 = new Guard(watch);
        guard1.setName("Охранник 1");
        guard1.start();

        Guard guard2 = new Guard(watch);
        guard2.setName("Охранник 2");
        guard2.start();

        while (true) {
            watch.waitForShiftChange();
            System.out.println("Смена охранников.");
        }
    }
}
