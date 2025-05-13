package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Speed: ");
        float speed = scanner.nextFloat();
        System.out.print("Enter the Time: ");
        float time = scanner.nextFloat();
        float dist = time * speed;
        float lit = dist/12;
        System.out.println("The distance will be: "+dist);
        System.out.println("The liters will be: "+lit);
    }
}
