package javacore.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
