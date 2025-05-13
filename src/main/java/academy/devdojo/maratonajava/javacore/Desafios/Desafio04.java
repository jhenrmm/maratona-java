package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print(num-1+", ");
        System.out.print(num+", ");
        System.out.print(num+1);
    }
}
