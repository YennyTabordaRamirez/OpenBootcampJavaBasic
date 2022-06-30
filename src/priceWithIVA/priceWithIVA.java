package priceWithIVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class priceWithIVA {

    static float iva = 0.19f;

    public static void main(String[] args) {
        double totalPrice = calculateTotalPrice(getPrice());
        printPrice(totalPrice);

    }

    public static void printPrice(double totalPrice){
        System.out.println("The total price to pay is: $" + String.format("%.2f", totalPrice));
    }

    public static double getPrice(){
        Scanner sc = new Scanner(System.in);
        double price;
        System.out.print("Please, type the product price $");
        price =  sc.nextDouble();
        return price;
    }

    public static double calculateTotalPrice(double price){
        double totalPrice = price + (price * iva);
        return totalPrice;

    }
}
