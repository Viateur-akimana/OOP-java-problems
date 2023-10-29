package object.viateur;

public class Problem03 {
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
