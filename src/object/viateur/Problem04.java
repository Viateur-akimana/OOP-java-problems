package object.viateur;
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
public class Problem04 {
    public static void main(String[] args) {
        // Create an instance of class B
        B objectB = new B();

        // Call the hello method on the object of class B
        objectB.hello(); // Output: Hello from B
    }
}

