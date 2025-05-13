package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.next();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Legal age");
        } else {
            System.out.println("Under age");
        }
    }
}
