package org.lessons.shop;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Cart {
    public static void main(String[] args) {

        ArrayList<Product> cartArray = new ArrayList<Product>();

        Scanner userInput = new Scanner(System.in);
        String keepAliveString = "";
        while (!keepAliveString.equals("no")) {
            System.out.println(
                    "Select a product by submitting the corresponding number: \n 1 - Smarthphone \n 2 - Flatscreen \n 3 - Headphones");
            int userChoice = userInput.nextInt();
            userInput.nextLine(); // consume the leftover \n

            System.out.println("Please specify the product's name");
            String productName = userInput.nextLine();
            System.out.println("Please specify the product's brand");
            String productBrand = userInput.nextLine();
            System.out.println("Please specify the product's price");
            BigDecimal productPrice = userInput.nextBigDecimal();
            System.out.println("Please specify the product's iva");
            Float productIva = userInput.nextFloat();

            switch (userChoice) {
                case 1:
                    System.out.println("Please specify the smartphone's memory");
                    int smartphoneDeviceMemory = userInput.nextInt();
                    Smartphone smartphone = new Smartphone(productName, productBrand, productPrice, productIva,
                            smartphoneDeviceMemory);

                    cartArray.add(smartphone);
                    break;

                case 2:
                    System.out.println("Please specify the flatscreen's size");
                    int flatscreenScreenSize = userInput.nextInt();
                    System.out.println("Please specify if flatscreen is smart (true/false)");
                    boolean flatscreenIsSmart = userInput.nextBoolean();
                    Flatscreen flatscreen = new Flatscreen(productName, productBrand, productPrice, productIva,
                            flatscreenScreenSize, flatscreenIsSmart);
                    cartArray.add(flatscreen);
                    break;

                case 3:
                    userInput.nextLine();
                    System.out.println("Please specify the headphones's color");
                    String headphonesColor = userInput.nextLine();
                    System.out.println("Please specify if the headphones are wireless (true/false)");
                    boolean headphonesIsWireless = userInput.nextBoolean();
                    Headphones headphones = new Headphones(productName, productBrand, productPrice, productIva,
                            headphonesColor,
                            headphonesIsWireless);
                    cartArray.add(headphones);
                    break;

                default:
                    break;
            }

            userInput.nextLine();
            System.out.println("do you want to add another product? (yes / no)");
            keepAliveString = userInput.nextLine();
        }

        for (int i = 0; i < cartArray.size(); i++) {
            System.out.println("-----------------------");
            System.out.println("Product " + (i + 1) + "'s info: ");
            System.out.println(cartArray.get(i));
        }
        userInput.close();
    }
}
