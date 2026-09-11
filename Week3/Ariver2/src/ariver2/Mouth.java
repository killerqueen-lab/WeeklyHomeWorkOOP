package ariver2;


public class Mouth extends Ariver2 {
    private Ariver2 river;

    public Mouth(Location location, Ariver2 river) {
        super(location);
        this.river = river;
    }
}
