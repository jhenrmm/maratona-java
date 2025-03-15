package javacore.Desafios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salMin = 1293.20F;
        System.out.print("Enter your salary: ");
        float sal = scanner.nextFloat();
        float numSal = sal/salMin;
        System.out.println(numSal);
    }
}
