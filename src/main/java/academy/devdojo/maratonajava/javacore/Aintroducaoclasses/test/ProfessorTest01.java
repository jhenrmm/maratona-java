package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void  main(String[] args){
        Professor professor = new Professor();
        professor.name = "Joaquim";
        professor.age = 45;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.name+" | Idade: "+ professor.age+" | Sexo: "+professor.sexo);
    }
}
