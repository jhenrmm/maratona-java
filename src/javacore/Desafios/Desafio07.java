package javacore.Desafios;

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value (true / false): ");
        boolean val1 = scanner.nextBoolean();
        System.out.print("Enter the second value (true / false): ");
        boolean val2 = scanner.nextBoolean();
        if (val1 && val2){
            System.out.println("True");
        }
        else if (!val1 && !val2){
            System.out.println("False");
        } else {
            System.out.println("Different");
        }

    }
}
