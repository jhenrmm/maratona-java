package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> listaBarco =  criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(listaBarco);
    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}

