package Tasks22_01_2024;

// Мною будет использован класс "Человек"

public class HumanBeing {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Mike", 56);
        person1.introduction();
        person1.calculateToRetirement();
//        int yearsToRetirementOne = person1.calculateToRetirement();
//        System.out.println("Years to retirement left: " + yearsToRetirementOne);


        Person person2 = new Person();
        person2.setNameAndAge("Walter", 51);
        person2.introduction();
//        int yearsToRetirementTwo = person2.calculateToRetirement();
//        System.out.println("Years to retirement left: " + yearsToRetirementTwo);

    }

    static class Person {
        String name;
        int age;

        public void setNameAndAge(String username, int userage){
            name = username;
            age = userage;
        }

        public int calculateToRetirement(){
         int years = 65 - age;
         return years;
        }

        public void introduction(){
            System.out.println("Hello! My name is " + name + ", I'm " + age + " years old.");
        }
    }
}

