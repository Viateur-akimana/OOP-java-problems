package object.viateur;


class BoxWeight extends Box {
    int weight;

    public BoxWeight(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
