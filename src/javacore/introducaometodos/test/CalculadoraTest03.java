package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
//        int[] numeros = calculadora.listaNums(new int[]{1,2,3,4,5,6});
//        for (int i  = 0;i < numeros.length; i++)
//        System.out.println(numeros[i]);
        boolean result = calculadora.numeroParouImpar(5);
        System.out.println(result);
    }
}
