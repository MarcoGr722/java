import java.util.ArrayList;
import java.util.List;


abstract class Animal {
    abstract void makeSound();
}

// дочірній клас
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// дочірній клас
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}


class Labrador extends Dog {
    @Override
    void makeSound() {
        System.out.println("Labrador Woof!");
    }
}


class AnimalShelter {
    private List<Dog> dogs;
    private List<Animal> otherAnimals;

    public AnimalShelter() {
        dogs = new ArrayList<>();
        otherAnimals = new ArrayList<>();
    }

    // додав собак
    public void addDogs(Dog dog) {
        dogs.add(dog);
        System.out.println("Dog added: " + dog.getClass().getSimpleName());
    }

    //  додав інших тварин
    public void addOtherAnimals(Animal animal) {
        otherAnimals.add(animal);
        System.out.println("Animal added: " + animal.getClass().getSimpleName());
    }

    // метод для вивед звуків
    public void printAnimalSounds() {
        System.out.println("Sounds of all dogs:");
        for (Dog dog : dogs) {
            dog.makeSound();
        }

        System.out.println("Sounds of all other animals:");
        for (Animal animal : otherAnimals) {
            animal.makeSound();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Labrador labrador = new Labrador();


        AnimalShelter shelter = new AnimalShelter();


        shelter.addDogs(dog);
        shelter.addDogs(labrador);


        shelter.addOtherAnimals(cat);


        shelter.printAnimalSounds();
    }
}
