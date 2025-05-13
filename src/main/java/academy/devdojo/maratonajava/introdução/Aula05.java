package academy.devdojo.maratonajava.introdução;

public class Aula05 {
    public static void main(String[] args) {
        double salary = 5000;
        String doar = "Posso doar";
        String naoDoar = "Não posso doar";
        float despesa = 4000F;
        String resultado = "";
        salary -= despesa;
        resultado = salary >= 1000 ? doar : naoDoar;
        System.out.println(resultado);
        /*
        byte dia = 5
        switch(dia);
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Opção Inválida")
                break;
         */
        }
    }
