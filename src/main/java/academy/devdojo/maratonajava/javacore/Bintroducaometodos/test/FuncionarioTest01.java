package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Jorge");
        funcionario.setAge(45);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        System.out.println("Média: "+funcionario.getMedia());
    }
}
