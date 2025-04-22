package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.BarcoRentavelService;
import javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentavelService<Carro> rentavelServiceCarro = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentavelServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentavelServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("==================");

        RentavelService<Barco> rentavelServiceBarco = new RentavelService<>(barcosDisponiveis);
        Barco barco = rentavelServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentavelServiceBarco.retornarObjetoAlugado(barco);
    }
}
