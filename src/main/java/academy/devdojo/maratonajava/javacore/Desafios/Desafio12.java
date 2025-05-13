package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product price: ");
        float price = scanner.nextFloat();
        System.out.println("1 - Pay in cash or Pix, get a 15% discount\n" +
                "\n" +
                "2 - Pay in cash by credit card, get a 10% discount\n" +
                "\n" +
                "3 - Pay in two installments on the card, normal price of the product without interest\n" +
                "\n" +
                "4 - Pay in three installments on the card or more, normal price of the product plus 10% interest");
        System.out.print("Enter the Option: ");
        int option = scanner.nextInt();
        if (option == 1){
            price = price - price*15/100;
        } else if (option == 2){
            price = price - price * 10/100;
        } else if (option == 3){
            price = price;
        } else if (option == 4){
            price = price + price * 10/100;
        } else {
            System.out.println("Invalid Option");
        }
        System.out.println("The total price is: "+price);
    }
}
