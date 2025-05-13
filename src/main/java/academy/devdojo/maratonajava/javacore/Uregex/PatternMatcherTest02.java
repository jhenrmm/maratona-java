package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os numeros
        // \D = tudo o que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres menos os espacos brancos
        // \w = a-Z A-Z, digitos, _ (todos esses valores são verificados)
        // \W = Tudo o que não for incluso no \w
        String regex = "\\d";
        String texto = "abaaba";
        String texto2 = "hhj212gvh21kh2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
