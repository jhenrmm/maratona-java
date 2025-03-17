package javacore.Desafios;

import java.util.Scanner;

public class Desafio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the B number: ");
        int num2 = scanner.nextInt();
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The A is: "+num1);
        System.out.println("The B is: "+num2);
    }
}
