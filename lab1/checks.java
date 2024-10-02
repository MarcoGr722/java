//Завдання №2: оператор if else
//  Написати програму, яка перевіряє чи є число додатним, від’ємним чи  нулем.

import java.util.Scanner;

public class checks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double число = scanner.nextDouble();

        if (число > 0) {
            System.out.println("Це додатне число.");
        } else if (число < 0) {
            System.out.println("Це від’ємне число.");
        } else {
            System.out.println("Це нуль.");
        }


        scanner.close();
    }
}
