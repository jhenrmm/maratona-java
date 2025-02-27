package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Pedro";
        estudante.age = 19;
        estudante.sexo = 'M';
        estudante.imprime();
    }
}
