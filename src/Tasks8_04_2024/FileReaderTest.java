package Tasks8_04_2024;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderTest extends DomesticChemical {
    public FileReaderTest(String name, double price) {
        super(name, price);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\ProductList.txt");

//        System.out.println(readProductList(file));

        List<String> productList = new ArrayList<>(readProductList(file));

        getProductList(productList);
    }

    public static List<String> readProductList(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> stringList = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            stringList.add(st);
        }
        return stringList;
    }

    public static String getProductList(List<String> productList) throws IOException {
        String getProduct = null;
        String[] itemInArray = new String[]{};
        String[] priceInArray = new String[]{};
        String itemPrice = null;
        String itemName = null;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).isEmpty()) {
                continue;
            }

            getProduct = productList.get(i);
            itemInArray = getProduct.split(":");
            priceInArray = itemInArray[1].split("-");
            itemPrice = priceInArray[1];
            itemName = priceInArray[0];

            if (productList.get(i).startsWith("Бытовая химия:")) {
                System.out.println(getProduct);
                DomesticChemical domesticChemical1 = new DomesticChemical(itemName.trim(),Double.parseDouble(itemPrice.trim()));
                System.out.println(domesticChemical1.name + "\n" + domesticChemical1.price);
            }
            if (productList.get(i).startsWith("Одежда:")) {
                System.out.println(getProduct);
                Clothing clothing1 = new Clothing(itemName.trim(),Double.parseDouble(itemPrice.trim()));
                System.out.println(clothing1.name + "\n" + clothing1.price);
            }
            if (productList.get(i).startsWith("Алкогольные напитки:")) {
                System.out.println(getProduct);
                Beverage beverage1 = new Beverage(itemName.trim(),Double.parseDouble(itemPrice.trim()));
                System.out.println(beverage1.name + "\n" + beverage1.price);
            }
        }
        return getProduct;
    }
}
