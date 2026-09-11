package ashape;


public class Square extends AShape {
        private CartesianPoint location;
	private int side;

	public Square(CartesianPoint location, int side) {
                this.location = location;
		this.side = side;
	}
}
