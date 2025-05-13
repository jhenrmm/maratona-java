package academy.devdojo.maratonajava.introdução;

public class Aula08 {
    public static void main(String[] args) {
        int[][] dias = {{31,28,30},{31,30,31},{30,31,30}};


        for(int i = 0;i< dias.length;i++){
            for(int j = 0;j < dias.length;j++){
                System.out.println(dias[i][j]);
            }
        }

    }
}
