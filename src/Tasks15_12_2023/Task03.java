package Tasks15_12_2023;


import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        String[] sounds = {"Meow", "Woof", "Cuckoo"};
        String[] animals = {"Cat", "Dog", "Rooster"};
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + animals[i]);
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the animal: ");
            int numberOfAnimal = scanner.nextInt();

            if (numberOfAnimal < 1 || numberOfAnimal > animals.length) {
                System.out.println("Wrong number. Please try again.");
                continue;
            }
            System.out.println(sounds[numberOfAnimal - 1]);
            break;
        }
    }
}