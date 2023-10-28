package object.viateur;

// Organism class
class Organism {
    public Organism() {
        System.out.println("An organism is created.");
    }
}

// Animal class, subclass of Organism
class Animal extends Organism {
    protected String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public void hello() {
        System.out.println("Animal makes a sound: " + sound);
    }
}

// Canine class, subclass of Animal
class Canine extends Animal {
    public Canine(String sound) {
        super(sound);
    }
}

// Dog class, subclass of Canine
class Dog extends Canine {
    public Dog() {
        super("Bark");
    }
}

// Wolf class, subclass of Canine
class Wolf extends Canine {
    public Wolf() {
        super("Howl");
    }
}

// Feline class, subclass of Animal
class Feline extends Animal {
    public Feline(String sound) {
        super(sound);
    }
}

// Lion class, subclass of Feline
class Lion extends Feline {
    public Lion() {
        super("Roar");
    }
}

// Cat class, subclass of Feline
class Cat extends Feline {
    public Cat() {
        super("Meow");
    }
}

// Main class
public class Problem05 {
    public static void main(String[] args) {
        // Create an array of animals
        Animal[] animals = {new Dog(), new Wolf(), new Lion(), new Cat()};

        // Call hello method using a for loop
        for (Animal animal : animals) {
            animal.hello();
        }
    }
}

