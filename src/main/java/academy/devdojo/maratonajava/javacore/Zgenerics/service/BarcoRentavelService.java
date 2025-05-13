package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barcos disponivel...");
        Barco barcos = barcosDisponiveis.remove(0);
        System.out.println("Alugando barcos: "+barcos);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barcos;
    }

    public void retornarBarcoAlugado(Barco barcos){
        System.out.println("Devolvendo barcos "+barcos);
        barcosDisponiveis.add(barcos);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
