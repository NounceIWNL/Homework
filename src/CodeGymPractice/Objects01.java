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

    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {


    }
}
