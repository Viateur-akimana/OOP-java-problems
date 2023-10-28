package object.viateur;
// Class A with a string property called message and a method called hello
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

    // Override the message variable in class B
    @Override
    public void hello() {
        super.hello(); // Call the hello method of class A
        System.out.println("Hello from class B: " + message);
    }
}

// Class Exercise01 with a main method
public class Problem01 {
    public static void main(String[] args) {
        // Create an instance of class B and call the hello method
        B objectB = new B("Message from class B!");
        objectB.hello();
        // Output: Message from class B!
        //         Hello from class B: Message from class B!
    }
}
