package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio15 {
    public static void main(String[] args) {
        int months = 0;
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        months = age * 12;
        days = months * 30;
        System.out.println("Years: "+age);
        System.out.println("Months: "+months);
        System.out.println("Days: "+days);
    }
}
