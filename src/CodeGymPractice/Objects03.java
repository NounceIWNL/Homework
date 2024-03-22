package CodeGymPractice;
/*
Using the Rabbit class as a pattern, create Horse and Hamster classes.

What do you think the toString method in the Horse and Hamster classes should return?

In the main method, create two objects of each class and display them on the screen.

Rabbit objects have already been created and are displayed on the screen.

Requirements:
•	Create a Horse class.
•	Create a Hamster class.
•	The Horse class must correctly implement the toString method.
•	The Hamster class must correctly implement the toString method.
•	In the main method, create two Horse objects.
•	In the main method, create two Hamster objects.
•	Display all the created objects on the screen.
 */

public class Objects03 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        System.out.println(rabbit1);
        System.out.println(rabbit2);

        //write your code here
    }

    public static class Rabbit {
        public String toString() {
            return "Rabbit";
        }
    }

    //write your code here
}