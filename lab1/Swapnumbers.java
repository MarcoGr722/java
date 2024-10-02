//Завдання №1: Примітивні типи даних
// Написати програму для заміни двох чисел за допомогою тимчасової змінної.

public class Swapnumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Початкові значення :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Після заміни:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
