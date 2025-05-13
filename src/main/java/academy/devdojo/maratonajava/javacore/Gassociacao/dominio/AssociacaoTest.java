package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Pedro", 17);
        Professor professor = new Professor("Lucas", "Matemática");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Analise de algoritimos", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
