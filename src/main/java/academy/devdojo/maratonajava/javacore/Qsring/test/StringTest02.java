package academy.devdojo.maratonajava.javacore.Qsring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Pedro    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("d","r"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,numeros.length()));
        System.out.println(nome.trim());
    }
}
