package javacore.Desafios;

import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first grade: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second grade: ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter the third grade: ");
        float num3 = scanner.nextFloat();
        float mean = (num1+num2+num3)/3;
        System.out.println("The mean is: "+mean);
    }
}
