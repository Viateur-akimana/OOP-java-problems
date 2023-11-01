package object.viateur;

   public class User {
        private String name;
        private int age;

        // Constructor
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }
    }

    class Main {
        public static void main(String[] args) {
            // Create 3 instances of User
            User user1 = new User("Alice", 25);
            User user2 = new User("Bob", 30);
            User user3 = new User("Charlie", 35);

            // Print the name and age of each instance using getter methods
            System.out.println("User 1: Name = " + user1.getName() + ", Age = " + user1.getAge());
            System.out.println("User 2: Name = " + user2.getName() + ", Age = " + user2.getAge());
            System.out.println("User 3: Name = " + user3.getName() + ", Age = " + user3.getAge());
        }
    }


