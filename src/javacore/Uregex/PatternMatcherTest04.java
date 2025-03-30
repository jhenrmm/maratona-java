package javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os numeros
        // \D = tudo o que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres menos os espacos brancos
        // \w = a-Z A-Z, digitos, _ (todos esses valores são verificados)
        // \W = Tudo o que não for incluso no \w
        // [] = encontra todos os termos dentro da lista
        // ? Zero ou uma ocorrencia
        // * Zero ou mais ocorrencias
        // + Uma ou mais ocorrencias
        // {n,m} de n até m
        // ()
        // | o(v/c)o ovo|oco
        // $ final de linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
        int numeroHex = 0x109;
        System.out.println(numeroHex);
    }
}
