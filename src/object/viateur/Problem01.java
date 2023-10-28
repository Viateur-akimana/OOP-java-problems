package object.viateur;
// Class A with a string property called message and a method called hello
class A {
    protected String message; // protected so that it can be accessed by subclass B

    // Constructor to initialize the message property with a parameter
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
    // Default constructor for class B
    public B() {
        super("Hello from B"); // Call superclass constructor with a default message
    }

    // Constructor with a parameter for class B (if needed)
    // public B(String customMessage) {
    //     super(customMessage);
    // }
}

// Class Exercise01 with a main method
public class Problem01 {
    public static void main(String[] args) {
        // Create an instance of class B
        B objectB = new B();

        // Call the hello method on the object of class B
        objectB.hello(); // Output: Hello from B
    }
}
