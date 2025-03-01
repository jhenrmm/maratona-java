package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Pessoa;

public class PessosTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Pedro");
        pessoa.setAge(56);
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
