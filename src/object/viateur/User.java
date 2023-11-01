public class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods...

    // Override toString method to return a custom string representation
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
class Main {
    public static void main(String[] args) {
        // Create 3 instances of User
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);
        User user3 = new User("Charlie", 35);

        // Print each instance of User directly (toString method will be called)
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println("User 3: " + user3);
    }
}
