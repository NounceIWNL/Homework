package Tasks01_03_2024;


public class DataStracture {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}