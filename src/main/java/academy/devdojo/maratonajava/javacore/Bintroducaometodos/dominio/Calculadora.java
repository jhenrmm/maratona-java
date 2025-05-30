package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void somaArr(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public boolean numeroParouImpar(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }

    public int[] listaNums(int[]numeros){
        for (int i = 0; i< numeros.length; i++) {
            numeros[i] *= 2;
        }
        return numeros;
    }
}
