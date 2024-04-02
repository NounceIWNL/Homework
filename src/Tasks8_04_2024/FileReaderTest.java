package Tasks8_04_2024;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks8_04_2024\\ProductList.txt");

//        System.out.println(readProductList(file));

        List<String> productList = new ArrayList<>(readProductList(file));
//        System.out.println(getProductListFirst(productList));
//        System.out.println(getProductListSecond(productList));
        System.out.println(getProductListThird(productList));
    }

    public static List<String> readProductList(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> stringList = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            stringList.add(st);
        } return stringList;
    }

    public static String getProductListFirst(List<String> productList) throws IOException {
        String getProduct = null;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).startsWith("Одежда:")){
                break;
            }
            getProduct = productList.get(i);
            System.out.println(getProduct);
        } return getProduct;
    }

    public static String getProductListSecond(List<String> productList) throws IOException {
        String getProduct = null;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).startsWith("Алкогольные напитки:")){
                break;
            }
            getProduct = productList.get(i);
            if(productList.get(i).startsWith("Бытовая химия:")){
                continue;
            }
            System.out.println(getProduct);
        } return getProduct;
    }

    public static String getProductListThird(List<String> productList) throws IOException {
        String getProduct = null;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).startsWith("Бытовая химия:")){
                continue;
            }
            if(productList.get(i).startsWith("Одежда:")){
                continue;
            }
            getProduct = productList.get(i);
            System.out.println(getProduct);
        } return getProduct;
    }
}
