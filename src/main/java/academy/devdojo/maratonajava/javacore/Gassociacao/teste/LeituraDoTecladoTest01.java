package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei Sim/Não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}
