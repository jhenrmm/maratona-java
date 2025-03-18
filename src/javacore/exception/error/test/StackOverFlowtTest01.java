package javacore.exception.error.test;

public class StackOverFlowtTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
