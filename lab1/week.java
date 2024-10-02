//Завдання №3: оператор switch..case
//Написати програму, яка перетворює число (1-7) на відповідний день тижня.
import java.util.Scanner;

public class week {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть число (1-7): ");
        int day = scanner.nextInt();


        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Невірне число. Введіть число від 1 до 7.");
        }
        scanner.close();
    }
}
