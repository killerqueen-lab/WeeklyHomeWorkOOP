package pkgpackage;

import junit.framework.TestCase;

/** Tests that the objects used to create a delivery package can be constructed. */
public class PackageTest extends TestCase {
    public void testPackageConstructor() {
        Address senderAddress = new Address(
                "12", "Nguyen Trai", "District 1", "Ho Chi Minh City", "Vietnam");
        Address recipientAddress = new Address(
                "25", "Le Loi", "Hai Chau", "Da Nang", "Vietnam");

        Person sender = new Person("Nguyen Van An", senderAddress, "0901234567");
        Person recipient = new Person("Tran Thi Binh", recipientAddress, "0912345678");
        BoxSize boxSize = new BoxSize(30.0, 20.0, 15.0);

        Package deliveryPackage = new Package(
                boxSize, 2.5, sender, recipient, "https://tracking.example.com/PKG001");

        assertNotNull(deliveryPackage);
    }
}
