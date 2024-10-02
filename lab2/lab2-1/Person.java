public class Person {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
