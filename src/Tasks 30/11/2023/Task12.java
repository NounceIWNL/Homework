package Tasks;

public class Task12 {
    public static void main(String[] args) {
        double amountOfChildren = 257;

        double percentOfChildrenWithLowWeight = 0.6;
        double amountOfChildrenWithLowWeight = Math.ceil(amountOfChildren * percentOfChildrenWithLowWeight);
        double amountOfChildrenWithNormalWeight = amountOfChildren - amountOfChildrenWithLowWeight;

        double glassCapacity = 0.2;
        double packageCapacity = 0.9;
        double milkPackages = Math. ceil((amountOfChildrenWithLowWeight * glassCapacity) / packageCapacity);
        double pancakesAmount = amountOfChildrenWithNormalWeight + (amountOfChildrenWithLowWeight * 2);
        System.out.println("Amount of children with low weight is " + amountOfChildrenWithLowWeight);
        System.out.println("Amount of children with normal weight is " + amountOfChildrenWithNormalWeight);
        System.out.println("Amount of pancakes is " + pancakesAmount);
        System.out.println("Amount of milk packages is " + milkPackages);
        }
    }

