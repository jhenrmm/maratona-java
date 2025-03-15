package javacore.Desafios;

import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        int maior = 0;
        int meio = 0;
        int menor = 0;
        if (num1 > num2 && num1 > num3){
            maior = num1;
            if (num2 > num3){
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3){
            maior = num2;
            if (num1 > num3){
                meio = num1;
                menor = num3;
        } else {
                meio = num3;
                menor = num1;
            }
    }
        else if (num3 > num1 && num3 > num2) {
            maior = num3;
            if (num2 > num1){
                meio = num2;
                menor = num1;
            } else {
                meio = num1;
                menor = num2;
            }
        }
        System.out.println(maior+", "+meio+", "+menor);
        }
}
