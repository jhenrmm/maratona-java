package academy.devdojo.maratonajava.javacore.Desafios;

public class Desafio18 {
    public static void main(String[] args) {
    float franHeight = 1.50F;
    float franGrow = 0.02F;
    float saraHeight = 1.10F;
    float saraGrow = 0.03F;
    int years = 0;
    while (franHeight > saraHeight){
        franHeight += franGrow;
        saraHeight += saraGrow;
        years += 1;
    }
        System.out.println("In "+years+" years");
    }
}
