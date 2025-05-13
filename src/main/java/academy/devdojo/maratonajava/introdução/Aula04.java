package academy.devdojo.maratonajava.introdução;

public class Aula04 {
    public static void main(String[] args){
        int num1 = 10;
        double num2 = 20;
        double result = num1/num2;
        System.out.println(result);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= != ==
        boolean isBigger = 30 > 20;
        boolean isLower = 10 < 5;
        boolean isEqual = 10 == 10;
        boolean isDiff = 10 != 5;
        System.out.println(isBigger);
        System.out.println(isLower);
        System.out.println(isEqual);
        System.out.println(isDiff);

        // && (AND) || (OR) e ! (NOT)

        int age = 16;
        float salary = 3500F;
        boolean isAdult = age >= 18 && salary>2000F;
        System.out.println(isAdult);

        // = += -= *= /= %= ++ --

        double bonus = 1800;
        double price = 1000;
        price += bonus;
        price *= 2;
        price /= 2;
        System.out.println(price);
    }
}
