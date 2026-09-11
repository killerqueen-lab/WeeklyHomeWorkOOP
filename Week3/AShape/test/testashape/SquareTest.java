package testashape;

import ashape.CartesianPoint;
import ashape.Square;
import junit.framework.TestCase;


public class SquareTest extends TestCase {
	public void testConstructor() {
		new Square(new CartesianPoint(30, 60), 30);	
	}
}

