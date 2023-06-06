package SetsAndMapsAdvanced_Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> productAndShop = new HashMap<>();
        Map<String,Double> productAndPrice = new HashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("Revision")){
            String[] inputData = input.split(", ");

            String shopName = inputData[0];
            String productName = inputData[1];
            double productPrice = Double.parseDouble(inputData[2]);

            productAndShop.put(productName,shopName);
            productAndPrice.put(productName,productPrice);


          input = scanner.nextLine();
        }

    //   productAndShop.forEach((key,value) -> {
    //       System.out.println(value + "->");
     //      key.forEach(e ->
     //              System.out.printf("Product: %s, Price: %.1f",)
     //
    }
}
