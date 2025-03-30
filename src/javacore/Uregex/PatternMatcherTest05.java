package javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.+([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakuta@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Email Válido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
    }
}
