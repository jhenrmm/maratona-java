package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter your Height: ");
        float height = scanner.nextFloat();
        float imc = weight / (height*height);
        if (imc <= 18.5){
            System.out.println("Underweight");
        } else if (imc <= 24.9 && imc > 18.5){
            System.out.println("Ideal Weight");
        } else if (imc <= 29.9 && imc > 24.9) {
            System.out.println("Slightly Overweight");
        } else if (imc <= 34.9 && imc > 29.9) {
            System.out.println("Obesity I");
        } else if (imc <= 39.9 && imc > 34.9){
            System.out.println("Obesity II");
        } else {
            System.out.println("Obesity III");
        }
    }
}
