package Tasks25_03_2024;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleeping.");
    }

    @Override
    public void showInfo(){
        System.out.println("Id is " + this.id);
    }
}
