package Tasks25_03_2024;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Mike");
//        animal1.showInfo();
//        person1.showInfo();
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Mike");
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
