package Tasks08_04_2024_Copy;

import Tasks08_04_2024.DiscountList;
import Tasks08_04_2024.InitialProductList;
import Tasks08_04_2024.SurchargeList;
import com.sun.source.tree.BreakTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Product> productList;
    public static List<Surcharge> surchargeList;
    public static List<Discount> discountList;

    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks08_04_2024_Copy\\ProductList.txt");
        File file2 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks08_04_2024_Copy\\Surcharge.txt");
        File file3 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks08_04_2024_Copy\\Discount.txt");

        List<String> productListToRead = null;
        List<String> surchargeListToRead = null;
        List<String> discountListToRead = null;

        productListToRead = readProductInfoList(file1);
        surchargeListToRead = readProductInfoList(file2);
        discountListToRead = readProductInfoList(file3);

        productList = getProductList(productListToRead);
        surchargeList = getSurchargedList(surchargeListToRead);
        discountList = getDiscountList(discountListToRead);

//        System.out.println(productList);
//        System.out.println(surchargeList);
//        System.out.println(discountList);

        System.out.println(getProductListWithSurcharge(productList, surchargeList));

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

    public static List<Product> getProductList(List<String> productListWritten) throws IOException {
        productList = new ArrayList<>();
        String getProduct = null;
        String[] itemInArray = new String[]{};
        String[] priceInArray = new String[]{};
        String itemPrice = null;
        String itemName = null;
        String itemCategory = null;

        for (int i = 0; i < productListWritten.size(); i++) {
            if (productListWritten.get(i).isEmpty()) {
                continue;
            }
            getProduct = productListWritten.get(i);
            itemInArray = getProduct.split(":");
            priceInArray = itemInArray[1].split("-");
            itemCategory = itemInArray[0].trim();
            itemPrice = priceInArray[1].trim();
            itemName = priceInArray[0].trim();
            productList.add(new Product(itemCategory, itemName, Double.parseDouble(itemPrice)));
        }
        return productList;
    }

    public static List<Surcharge> getSurchargedList(List<String> surchargeListWritten) throws IOException {
        surchargeList = new ArrayList<>();
        String getProduct = null;
        String standardSurcharge = null;
        String[] itemInArray = new String[]{};
        String[] surchargeInArray = new String[]{};
        String[] surchargeInArrayNoSigns = new String[]{};
        String itemSurcharge = null;
        String itemName = null;
        String itemCategory = null;

        for (int i = 0; i < surchargeListWritten.size(); i++) {
            if (surchargeListWritten.get(i).isEmpty()) {
                continue;
            }
            getProduct = surchargeListWritten.get(i);
            itemInArray = getProduct.split(":");
            surchargeInArray = itemInArray[1].split("-");
            surchargeInArrayNoSigns = surchargeInArray[1].split("%");
            itemSurcharge = surchargeInArrayNoSigns[0].trim();
            itemName = surchargeInArray[0].trim();
            itemCategory = itemInArray[0].trim();

            if (surchargeListWritten.get(i).startsWith("Бытовая химия:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Моющее средство")) {
                    itemSurcharge = standardSurcharge;
                }
                surchargeList.add(new Surcharge(itemCategory, itemName, Double.parseDouble(itemSurcharge) / 100 + 1));
            }

            if (surchargeListWritten.get(i).startsWith("Одежда:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Туфли")) {
                    itemSurcharge = standardSurcharge;
                }
                if (itemName.startsWith("Блузка")) {
                    itemSurcharge = standardSurcharge;
                }
                surchargeList.add(new Surcharge(itemCategory, itemName, Double.parseDouble(itemSurcharge) / 100 + 1));
            }

            if (surchargeListWritten.get(i).startsWith("Алкогольные напитки:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Вино белое")) {
                    itemSurcharge = standardSurcharge;
                }
                surchargeList.add(new Surcharge(itemCategory, itemName, Double.parseDouble(itemSurcharge) / 100 + 1));
            }
        }
        return surchargeList;
    }

    public static List<Discount> getDiscountList(List<String> discountListWritten) throws IOException {
        discountList = new ArrayList<>();
        String getProduct = null;
        String[] itemInArray = new String[]{};
        String[] surchargeInArray = new String[]{};
        String[] surchargeInArrayNoSigns = new String[]{};
        String itemDiscount = null;
        String itemName = null;
        String itemCategory = null;


        for (int i = 0; i < discountListWritten.size(); i++) {
            if (discountListWritten.get(i).isEmpty()) {
                continue;
            }
            getProduct = discountListWritten.get(i);
            itemInArray = getProduct.split(":");
            surchargeInArray = itemInArray[1].split("-");
            surchargeInArrayNoSigns = surchargeInArray[1].split("%");
            itemCategory = itemInArray[0].trim();
            itemDiscount = surchargeInArrayNoSigns[0].trim();
            itemName = surchargeInArray[0].trim();
            discountList.add(new Discount(itemCategory, itemName, 1 - (Double.parseDouble(itemDiscount) / 100)));
        }
        return discountList;
    }

    public static List<Product> getProductListWithSurcharge(List<Product> product, List<Surcharge> surcharge) {
        for (int i = 0; i < product.size(); i++) {
            for (int j = 0; j < surcharge.size(); j++) {
                if (product.get(i).category.equals(surcharge.get(j).category) && product.get(i).name.equals(surcharge.get(j).name)) {
                    product.get(i).price = surcharge.get(j).getPrice((Product) product);
                    System.out.println(product.get(i));
                }
            }
        }
        return product;
    }
}





