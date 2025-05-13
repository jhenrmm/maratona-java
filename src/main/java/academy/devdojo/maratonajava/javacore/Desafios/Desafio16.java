package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        float side1 = scanner.nextFloat();
        System.out.print("Enter the second side: ");
        float side2 = scanner.nextFloat();
        System.out.print("Enter the third side: ");
        float side3 = scanner.nextFloat();
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
        }
    }
}
