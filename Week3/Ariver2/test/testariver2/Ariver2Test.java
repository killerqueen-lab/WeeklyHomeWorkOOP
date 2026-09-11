package testariver2;

import ariver2.Ariver2;
import ariver2.Confluence;
import ariver2.Location;
import ariver2.Mouth;
import ariver2.Source;
import junit.framework.TestCase;

public class Ariver2Test extends TestCase {
    public void testConstructor() {
        Ariver2 left = new Source(new Location(1, 1, "left"));
        Ariver2 right = new Source(new Location(1, 5, "right"));
        Ariver2 river = new Confluence(new Location(3, 3, "join"), left, right);

        Ariver2 mouth = new Mouth(new Location(5, 5, "mouth"), river);
    }
}
