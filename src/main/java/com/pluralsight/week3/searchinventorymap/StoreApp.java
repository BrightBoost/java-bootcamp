package com.pluralsight.week3.searchinventorymap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static HashMap<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item name are you interested in? ");
        String itemName = scanner.nextLine();
        Product matchedProduct = inventory.get(itemName);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {
        try {
            // read inventory line by line
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            // for each line
            while((line = br.readLine()) != null) {
                // create a product
                String[] productInfoArr = line.split("\\|");
                Product p = new Product(Integer.parseInt(productInfoArr[0]), productInfoArr[1], Float.parseFloat(productInfoArr[2]));
                // add it to the map
                inventory.put(productInfoArr[1], p);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
