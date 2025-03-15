package javacore.Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int val1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int val2 = scanner.nextInt();
        System.out.print("Enter the third value: ");
        int val3 = scanner.nextInt();
        int sum = val1 + val2;
        if (sum < val3){
            System.out.println("The third value is bigger than the sum of A and B");
        } else {
            System.out.println("The sum is bigger than the third value");
        }
    }
}
