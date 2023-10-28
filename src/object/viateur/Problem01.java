package object.viateur;
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
}

// Class Exercise01 with a main method
public class Problem01 {
    public static void main(String[] args) {
        // Create an instance of class A
        A objectA = new A("Hello from class A!");

        // Create an instance of class B
        B objectB = new B("Hello from class B!");

        // Call the hello method on both objects
        objectA.hello(); // Output: Hello from class A!
        objectB.hello(); // Output: Hello from class B!
    }
}
