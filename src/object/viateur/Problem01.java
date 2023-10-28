// Class A with a string property called message and a method called hello
class A {
    protected String message; // protected so that it can be accessed by subclass B

    // Constructor to initialize the message property
    public A(String message) {
        this.message = message;
    }

    // Method to print the message to the console
    public void hello() {
        System.out.println(message);
    }
}

// Class B which extends class A
class B extends A {
    // Constructor to initialize the message property through the superclass constructor
    public B(String message) {
        super(message);
    }

    // Override the hello method of class A
    @Override
    public void hello() {
        System.out.println("Overridden hello method in class B: " + message);
    }
}

// Class Exercise01 with a main method
public class Problem01 {
    public static void main(String[] args) {
        // Create an instance of class B and assign it to a variable of type A
        A objectA = new B("Hello from class B!");

        // Call the hello method on the variable of type A
        objectA.hello(); // Output: Overridden hello method in class B: Hello from class B!
    }
}
