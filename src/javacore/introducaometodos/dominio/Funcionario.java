package javacore.introducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print("R$" + salario + " | ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}

