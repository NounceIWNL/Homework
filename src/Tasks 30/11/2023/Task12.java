package Tasks;

public class Task12 {
    public static void main(String[] args) {
        double amountOfChildren = 250;

        double firstAmountOfChildren = 1 * amountOfChildren;
        double secondAmountOfChildren = 0.6 * amountOfChildren;
        double thirdAmountOfChildren = 0.01 * amountOfChildren;

        double glassCapacity = 0.2;
        double packageCapacity = 0.9;
        double milkPackages;
        double pancakesAmount;
        double pancakes = 1;

        /*  1st condition 100% : 100 children = 200 pancakes + 20 milks packages
            2nd condition 60%  : 60 children = 120 pancakes + 12 milks packages
                            40 children = 40 pancakes
            3rd condition 1%  : 1 kid = 2 pancakes + 1 milk glass
                            99 children = 99 pancakes
         */

        if (amountOfChildren == firstAmountOfChildren) {
            pancakesAmount = amountOfChildren * pancakes * 2;
            milkPackages = amountOfChildren * glassCapacity / packageCapacity;
            System.out.println(milkPackages + " " + pancakesAmount);
        } if (amountOfChildren == secondAmountOfChildren) {
            pancakesAmount = (amountOfChildren - secondAmountOfChildren) * pancakes + (secondAmountOfChildren * pancakes);
            milkPackages = (amountOfChildren - secondAmountOfChildren) * glassCapacity / packageCapacity + (secondAmountOfChildren * glassCapacity / packageCapacity);
            System.out.println(milkPackages + " " + pancakesAmount);
        } if (amountOfChildren == thirdAmountOfChildren) {
            pancakesAmount = (amountOfChildren - thirdAmountOfChildren) * pancakes + (thirdAmountOfChildren * pancakes);
            milkPackages = (amountOfChildren - thirdAmountOfChildren) * glassCapacity / packageCapacity + (thirdAmountOfChildren * glassCapacity / packageCapacity);
            System.out.println(milkPackages + " " + pancakesAmount);
        }
    }
} 

