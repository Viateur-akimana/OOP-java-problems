package object.viateur;


public class App {
    public static Box createBox(int width, int height, int depth) {
        return new Box(width, height, depth);
    }

    public static BoxWeight createBoxWeight(int width, int height, int depth, int weight) {
        return new BoxWeight(width, height, depth, weight);
    }

    public static void main(String[] args) {
        // Creating a Box object
        Box box1 = createBox(10, 20, 30);
        System.out.println("Box Dimensions - Width: " + box1.width + ", Height: " + box1.height + ", Depth: " + box1.depth);

        // Creating a BoxWeight object
        BoxWeight boxWeight1 = createBoxWeight(5, 10, 15, 25);
        System.out.println("Box Dimensions - Width: " + boxWeight1.width + ", Height: " + boxWeight1.height +
                ", Depth: " + boxWeight1.depth + ", Weight: " + boxWeight1.weight);
    }
}

