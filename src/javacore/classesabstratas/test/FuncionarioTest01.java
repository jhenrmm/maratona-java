package javacore.classesabstratas.test;

import javacore.classesabstratas.dominio.Desenvolvedor;
import javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Roger", 12000);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
