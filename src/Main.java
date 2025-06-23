// Base class (superclass)
class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to be inherited
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Derived class (subclass)
class Dog extends Animal {

    private String breed;

    // Constructor calling superclass constructor using super()
    public Dog(String name, String breed) {
        super(name); // call to superclass constructor
        this.breed = breed;
    }

    // Overriding method
    @Override
    public void speak() {
        System.out.println(name + " barks. (Breed: " + breed + ")");
    }

    // New method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("GenericAnimal");
        genericAnimal.speak(); // Output: GenericAnimal makes a sound.

        // Create a Dog object
        Dog dog = new Dog("Bruno", "Labrador");
        dog.speak();  // Output: Bruno barks. (Breed: Labrador)
        dog.fetch();  // Output: Bruno is fetching the ball!
    }
}
