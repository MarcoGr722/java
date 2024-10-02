public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(25);
            System.out.println("Age set to: " + person.getAge());

            person.setAge(-5);
        } catch (InvalidAgeException e) {
            
            System.out.println(e.getMessage());
        }
    }
}
//1. Exception: Створіть спеціальний Exception під назвою InvalidAgeExceptoin, який викидається, коли вік людини має від’ємне
//значення. Реалізуйте клас, який встановлює та отримує вік людини,забезпечуючи належну обробку винятку.