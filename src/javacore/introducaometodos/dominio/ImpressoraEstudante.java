package javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
    }
}
