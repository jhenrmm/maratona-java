package javacore.Desafios;

import java.util.Random;

public class Desafio21 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(101);
        System.out.println("Random number between 0 and 100: "+num);
    }
}
