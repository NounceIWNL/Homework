package Tasks8_04_2024;

import java.io.*;
import java.util.*;

public class FileReaderTest extends InitialProductList {
    public FileReaderTest(String name, double price) {
        super(name, price);
    }

    public static ArrayList<InitialProductList> initialProductListArray;
    public static ArrayList<SurchargeList> surchargedProductListArray;
    public static ArrayList<DiscountList> discountedProductListArray;

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\ProductList.txt");
        File file2 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\Surcharge.txt");
        File file3 = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\Discount.txt");

        List<String> productListToRead = null;
        List<String> surchargeListToRead = null;
        List<String> discountListToRead = null;

        productListToRead = new ArrayList<>(readProductInfoList(file1));
        surchargeListToRead = new ArrayList<>(readProductInfoList(file2));
        discountListToRead = new ArrayList<>(readProductInfoList(file3));

        getProductNameList(productListToRead);
        getSurchargedList(surchargeListToRead);
        getDiscountList(discountListToRead);

        System.out.println();


//        System.out.println((getProductNameList(productListToRead)));
//        System.out.println((getSurchargedList(surchargeListToRead)));
//        System.out.println((getDiscountList(discountListToRead)));

        System.out.println();


        for (int i = 0, j = 0; i < initialProductListArray.size() && j < surchargedProductListArray.size(); i++, j++) {
            initialProductListArray.get(i).price *= surchargedProductListArray.get(j).price;
            System.out.println(initialProductListArray.get(i));
        }
        System.out.println();
        for (int i = 0; i < initialProductListArray.size(); i++) {
            for (int j = 0; j < discountedProductListArray.size(); j++) {
                if (initialProductListArray.get(i).name.equals(discountedProductListArray.get(j).name)) {
                    initialProductListArray.get(i).price *= discountedProductListArray.get(j).price;
                    System.out.println(initialProductListArray.get(i));
                }
            }
        }

        Details finalList = new DiscountList(new SurchargeList(new InitialProductList()));


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

    public static ArrayList<DiscountList> getDiscountList(List<String> discountList) throws IOException {
        discountedProductListArray = new ArrayList<>();
        String getProduct = null;
        String standardSurcharge = null;
        String[] itemInArray = new String[]{};
        String[] surchargeInArray = new String[]{};
        String[] surchargeInArrayNoSigns = new String[]{};
        String itemDiscount = null;
        String itemName = null;


        for (int i = 0; i < discountList.size(); i++) {
            if (discountList.get(i).isEmpty()) {
                continue;
            }
            getProduct = discountList.get(i);
            itemInArray = getProduct.split(":");
            surchargeInArray = itemInArray[1].split("-");
            surchargeInArrayNoSigns = surchargeInArray[1].split("%");
            itemDiscount = surchargeInArrayNoSigns[0].trim();
            itemName = surchargeInArray[0].trim();


            if (discountList.get(i).startsWith("Бытовая химия:")) {
                if (itemName.startsWith("Средство для мытья стекол")) {
                    discountedProductListArray.add(new DiscountList(itemName, 1 - (Double.parseDouble(itemDiscount) / 100)));
                }
            }

            if (discountList.get(i).startsWith("Одежда:")) {
                if (itemName.startsWith("Туфли")) {
                    discountedProductListArray.add(new DiscountList(itemName, 1 - (Double.parseDouble(itemDiscount) / 100)));
                }
                if (itemName.startsWith("Блузка")) {
                    discountedProductListArray.add(new DiscountList(itemName, 1 - (Double.parseDouble(itemDiscount) / 100)));
                }
            }

            if (discountList.get(i).startsWith("Алкогольные напитки:")) {
                if (itemName.startsWith("Коньяк")) {
                    discountedProductListArray.add(new DiscountList(itemName, 1 - (Double.parseDouble(itemDiscount) / 100)));
                }
            }
        }
        return discountedProductListArray;
    }

    public static ArrayList<SurchargeList> getSurchargedList(List<String> surchargeList) throws IOException {
        surchargedProductListArray = new ArrayList<>();
        String getProduct = null;
        String standardSurcharge = null;
        String[] itemInArray = new String[]{};
        String[] surchargeInArray = new String[]{};
        String[] surchargeInArrayNoSigns = new String[]{};
        String itemSurcharge = null;
        String itemName = null;

        for (int i = 0; i < surchargeList.size(); i++) {
            if (surchargeList.get(i).isEmpty()) {
                continue;
            }
            getProduct = surchargeList.get(i);
            itemInArray = getProduct.split(":");
            surchargeInArray = itemInArray[1].split("-");
            surchargeInArrayNoSigns = surchargeInArray[1].split("%");
            itemSurcharge = surchargeInArrayNoSigns[0].trim();
            itemName = surchargeInArray[0].trim();

            if (surchargeList.get(i).startsWith("Бытовая химия:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Стиральный порошок")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Моющее средство")) {
                    itemSurcharge = standardSurcharge;
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Средство для мытья стекол")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
            }

            if (surchargeList.get(i).startsWith("Одежда:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Рубашка")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Туфли")) {
                    itemSurcharge = standardSurcharge;
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Блузка")) {
                    itemSurcharge = standardSurcharge;
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Брюки")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
            }

            if (surchargeList.get(i).startsWith("Алкогольные напитки:")) {
                if (itemName.startsWith("Стандартная наценка")) {
                    standardSurcharge = surchargeInArrayNoSigns[0].trim();
                }
                if (itemName.startsWith("Вино красное")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Вино белое")) {
                    itemSurcharge = standardSurcharge;
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
                if (itemName.startsWith("Коньяк")) {
                    itemSurcharge = surchargeInArrayNoSigns[0].trim();
                    surchargedProductListArray.add(new SurchargeList(null, Double.parseDouble(itemSurcharge) / 100 + 1));
                }
            }
        }
        return surchargedProductListArray;
    }

    public static ArrayList<InitialProductList> getProductNameList(List<String> productList) throws IOException {
        initialProductListArray = new ArrayList<>();
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
            initialProductListArray.add(new InitialProductList(itemName.trim(), Double.parseDouble(itemPrice.trim())));
        }
        return initialProductListArray;
    }
}
