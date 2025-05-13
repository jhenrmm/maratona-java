package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature: ");
        float fahr = scanner.nextFloat();
        float cels = 0;
        cels = (5 * (fahr-32)/9);
        System.out.println("In celsius is: "+cels);
    }
}
