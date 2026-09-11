package ariver2;

public class Confluence extends Ariver2 {
    private Ariver2 left;
    private Ariver2 right;

    public Confluence(Location location, Ariver2 left, Ariver2 right) {
        super(location);
        this.left = left;
        this.right = right;
    }
}
