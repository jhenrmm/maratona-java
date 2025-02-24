package academy.devdojo.maratonajava.introdução;

public class Aula05 {
    public static void main(String[] args) {
        int age = -12;
        if (age >= 18) {
            System.out.println("Allowed");
        }
        else if(age < 0){
            System.out.println("Invalid");
        }
        else {
            System.out.println("Prohibited");
        }
    }
}
