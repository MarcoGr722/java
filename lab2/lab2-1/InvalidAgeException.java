public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Invalid age: Age cannot be negative.");
    }
    // конструкт  з параметром  для передач повідомл
    public InvalidAgeException(String message) {
        super(message);
    }
}
