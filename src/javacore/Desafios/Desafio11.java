package javacore.Desafios;

import java.util.Scanner;

public class Desafio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter the first grade: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second grade: ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter the third grade: ");
        float num3 = scanner.nextFloat();
        System.out.print("Enter the fourth grade: ");
        float num4 = scanner.nextFloat();
        float mean = (num1+num2+num3+num4)/4;
        System.out.println("Name: "+name);
        if (mean < 7){
            System.out.println("Situation: Reproved");
        } else {
            System.out.println("Situation: Approved");
        }
    }
}
