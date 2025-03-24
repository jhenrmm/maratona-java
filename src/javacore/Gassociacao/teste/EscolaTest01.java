package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Pedro");
        Professor professor2 = new Professor("Lucas");
        Professor professor3 = new Professor("Maria");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Colégio Prado", professores);
        escola.imprime();
    }
}
