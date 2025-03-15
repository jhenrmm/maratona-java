package javacore.Desafios;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number: ");
        float num1 = scanner.nextInt();
        System.out.print("Second Number: ");
        float num2 = scanner.nextInt();
        if (num1 == num2){
            float sum = num1 + num2;
            System.out.println("Sum: "+sum);
        } else {
            float times = num1 * num2;
            System.out.println("Times: "+times);
        }
    }
}
