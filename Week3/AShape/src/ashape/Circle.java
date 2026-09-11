package ashape;


public class Circle extends AShape {
    private CartesianPoint location;
    private int radius;
    
    public Circle(CartesianPoint location, int radius) {
        this.location = location;
        this.radius = radius;
    }
}
