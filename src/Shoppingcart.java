//Parikshit Abuj

import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What items you would like to buy?");
        item = scanner.nextLine();

        System.out.println("What is price for each");
        price = scanner.nextDouble();

        System.out.println("item quantity?");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought" + quantity + " " + item +"/s" );
        System.out.println("Your total is " + currency + total);

        scanner.close();


    }
}
