package academy.devdojo.maratonajava.introdução;

public class Aula06exerc {
    public static void main(String[] args) {
        /* imprimir todos os números pares de 0 até 1000000
        for (int i = 0;i<=1000000;i++){
        if (i % 2 == 0){
        System.out.println(i);
        }*/
        /*int cont = 1;
        int max = 50;
        for (int i = 1; i <= max; i++) {
            if (i > 25) {
                break;
                }
            System.out.println(i);
            }*/
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal/ parcela;
            if (valorParcela < 1000){
                continue;
                }
            System.out.println("Parcela "+parcela+" R$"+valorParcela);
        }
        }
    }
