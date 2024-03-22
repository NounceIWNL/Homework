package CodeGymPractice;

/*
Study the Human class carefully.

Correct the class so that only one initialize method initializes all the Human class's instance variables.

Requirements:
•	The Human class must have 5 variables.
•	The class must have one initialize method.
•	The initialize method must have five parameters.
 */

public class Objects01 {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public void initialize(String name, int money, char sex) {
        this.name = name;
        this.money = money;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
