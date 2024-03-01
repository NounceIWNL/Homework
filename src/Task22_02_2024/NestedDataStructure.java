package Task22_02_2024;

import java.util.ArrayList;
import java.util.Stack;

public class NestedDataStructure {

    private ArrayList<Stack<String>> nestedList;

    public NestedDataStructure() {
        this.nestedList = new ArrayList<>();
    }

    public void addElement(String element, int collectionIndex) {
        if (collectionIndex < nestedList.size()) {
            nestedList.get(collectionIndex).push(element);
        } else {
            Stack<String> newCollection = new Stack<>();
            newCollection.push(element);
            nestedList.add(newCollection);
        }
    }

    public void removeElement(int collectionIndex) {
        if (collectionIndex < nestedList.size() && !nestedList.get(collectionIndex).isEmpty()) {
            nestedList.get(collectionIndex).pop();
        } else {
            System.out.println("Collection is empty");
        }
    }

    public void printElements() {
        for (int i = 0; i < nestedList.size(); i++) {
            System.out.print("Collection " + i + ": ");
            if (nestedList.get(i).isEmpty()) {
                System.out.println("Empty");
            } else {
                Stack<String> temp = new Stack<>();
                while (!nestedList.get(i).isEmpty()) {
                    String element = nestedList.get(i).pop();
                    temp.push(element);
                    System.out.print(element + " ");
                }
                while (!temp.isEmpty()) {
                    nestedList.get(i).push(temp.pop());
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        NestedDataStructure nestedDataStructure = new NestedDataStructure();

        nestedDataStructure.addElement("A", 0);
        nestedDataStructure.addElement("B", 0);
        nestedDataStructure.addElement("C", 1);
        nestedDataStructure.addElement("D", 1);
        nestedDataStructure.addElement("E", 2);

        nestedDataStructure.printElements();

        nestedDataStructure.removeElement(1);
        nestedDataStructure.removeElement(2);

        nestedDataStructure.printElements();
    }
}
