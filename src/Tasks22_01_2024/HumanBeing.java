package Tasks22_01_2024;

// Мною будет использован класс "Человек"

// p.s. Возможно, я неправильно понял трактовку условия,
// поэтому здесь использованы сеттеры, геттеры и toString() одновременно

public class HumanBeing {
    public static void main(String[] args) {

        Person person1 = new Person("Mike", 56);
        System.out.println(person1);

        person1.setNameAndAge("Mike", 56);
        System.out.println("Hello! My name is " + person1.getName() + ", I'm " + person1.getAge() + " years old.");


        Person person2 = new Person("Walter", 51);
        System.out.println(person2);

        person2.setNameAndAge("Walter", 51);
        System.out.println("Hello! My name is " + person2.getName() + ", I'm " + person2.getAge() + " years old.");
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setNameAndAge(String name, int age) {
            if (name.isEmpty()) {
                System.out.println("Wrong input.");
            } else {
                this.name = name;
            }
            if (age < 1) {
                System.out.println("Wrong input.");
            } else {
                this.age = age;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return "Hello! My name is " + name + ", I'm " + age + " years old.";
        }
    }
}

