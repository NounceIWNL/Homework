package Tasks8_04_2024;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest extends DomesticChemical {
    public FileReaderTest(String name, double price) {
        super(name, price);
    }

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\ProductList.txt");
        File file2 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\Surcharge.txt");
        File file3 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\Discount.txt");

        System.out.println(readProductInfoList(file1));
        System.out.println(readProductInfoList(file2));
        System.out.println(readProductInfoList(file3));

        List<String> productList = new ArrayList<>(readProductInfoList(file1));
        List<String> SurchargeList = new ArrayList<>(readProductInfoList(file2));
        List<String> discountList = new ArrayList<>(readProductInfoList(file3));

//        getProductList(productList);
    }

    public static List<String> readProductInfoList(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> stringList = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            stringList.add(st);
        }
        return stringList;
    }

    public static String getSurchargedList(List<String> surchargeList) throws IOException {
        String getProduct = null;
        String standardSurcharge = null;
        String[] itemInArray = new String[]{};
        String[] surchargeInArray = new String[]{};
        String itemSurcharge = null;
        String itemName = null;

        for (int i = 0; i < surchargeList.size(); i++) {
            if (surchargeList.get(i).isEmpty()) {
                continue;
            }
            getProduct = surchargeList.get(i);
            itemInArray = getProduct.split(":");
            surchargeInArray = itemInArray[1].split("-");
            itemSurcharge = surchargeInArray[1];
            itemName = surchargeInArray[0];

            if (surchargeList.get(i).startsWith("Бытовая химия:")) {
                if(itemName.startsWith("Стандартная наценка")){
                    standardSurcharge = itemSurcharge;
                }
            }
        } return null;
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
                DomesticChemical domesticChemical1 = new DomesticChemical(itemName.trim(), Double.parseDouble(itemPrice.trim()));
                System.out.println(domesticChemical1.name + "\n" + domesticChemical1.price);
            }
            if (productList.get(i).startsWith("Одежда:")) {
                System.out.println(getProduct);
                Clothing clothing1 = new Clothing(itemName.trim(), Double.parseDouble(itemPrice.trim()));
                System.out.println(clothing1.name + "\n" + clothing1.price);
            }
            if (productList.get(i).startsWith("Алкогольные напитки:")) {
                System.out.println(getProduct);
                Beverage beverage1 = new Beverage(itemName.trim(), Double.parseDouble(itemPrice.trim()));
                System.out.println(beverage1.name + "\n" + beverage1.price);
            }
        }
        return getProduct;
    }
}
