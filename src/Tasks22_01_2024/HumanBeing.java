package Tasks22_01_2024;

// Мною будет использован класс "Человек"

public class HumanBeing {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setNameAndAge("Mike", 56);
//        person1.introduction();
        System.out.println("Hello! My name is " + person1.getName() + ", I'm " + person1.getAge() + " years old.");

        Person person2 = new Person();
        person2.setNameAndAge("Walter", 51);
//        person2.introduction();
        System.out.println("Hello! My name is " + person2.getName() + ", I'm " + person2.getAge() + " years old.");


    }

    static class Person {
        private String name;
        private int age;

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

//        public void introduction() {
//            System.out.println("Hello! My name is " + name + ", I'm " + age + " years old.");
//        }

        class Human{
            String name;
            int age;

            private void setName(String myName){
                name = myName;
            }
            private void setAge(int myAge){
                age = myAge;
            }
        }

    }
}

