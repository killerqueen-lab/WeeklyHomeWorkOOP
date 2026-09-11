package testperson;

import junit.framework.TestCase;
import person.Person;

public class PersonTest extends TestCase {
    public void testConstructor() {
        Person father = new Person("An", 1970, null, null);
        Person mother = new Person("Binh", 1972, null, null);

        new Person("Chi", 2000, father, mother);
    }
}
