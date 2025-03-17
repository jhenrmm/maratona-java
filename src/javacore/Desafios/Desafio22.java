package javacore.Desafios;

import java.util.Scanner;

public class Desafio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter other number: ");
        float num2 = scanner.nextFloat();
        float quot = num1/num2;
        System.out.println("Quotient: "+quot);
        System.out.println("Remainder of Integer Division: "+num1%num2);
    }
}
