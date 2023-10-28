package object.viateur;

public class A {
    protected String message;

    public A(String message) {
        this.message = message;
    }

    public void hello() {
        System.out.println(message);
    }
}
