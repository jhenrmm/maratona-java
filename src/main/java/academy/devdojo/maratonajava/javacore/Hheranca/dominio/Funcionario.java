package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro de Bloco de Inicialização estatico de Funcionario");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do Construtor de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu"+this.nome+" recebi o salário de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
