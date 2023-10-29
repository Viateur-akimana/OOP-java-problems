package object.viateur;

public class Problem02 {
    public static void main(String[] args) {
        // Create an instance of class B and assign it to a variable of type A
        A objectA = new B("Hello from class B!");
        B n = new B("jer iare the ");

        // Call the hello method on the variable of type A
        objectA.hello(); // Output: Overridden hello method in class B: Hello from class B!
    }
}
