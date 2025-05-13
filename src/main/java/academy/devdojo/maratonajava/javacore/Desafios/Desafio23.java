package academy.devdojo.maratonajava.javacore.Desafios;

import java.util.Scanner;

public class Desafio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour Price: ");
        float hourPrice = scanner.nextFloat();
        System.out.print("Number of classes per month: ");
        int numClass = scanner.nextInt();
        float salary = hourPrice * numClass;
        float inss = 0;
        if (salary <= 1518){
            inss = 7.50F;
        } else if (salary <= 2793.88 && salary >1518){
            inss = 9.00F;
        } else if(salary <= 4190.83 && salary > 2793.88){
            inss = 12.00F;
        } else if (salary <= 8157.41 && salary > 4190.83){
            inss = 14.00F;
        }
        float salaryDescount = salary - (salary * inss/100);
        System.out.println("Salary: "+ salaryDescount);

        scanner.close();
    }
}
