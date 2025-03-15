package javacore.Desafios;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = scanner.nextFloat();
        double numPer = num + num * 0.05;
        System.out.println(numPer);
    }
}
