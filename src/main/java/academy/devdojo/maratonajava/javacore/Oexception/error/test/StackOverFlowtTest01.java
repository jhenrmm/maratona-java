package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowtTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
