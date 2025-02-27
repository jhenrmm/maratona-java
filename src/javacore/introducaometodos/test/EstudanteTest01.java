package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante.name = "Pedro";
        estudante.age = 19;
        estudante.sexo = 'M';
        impressora.imprime(estudante);
    }
}
