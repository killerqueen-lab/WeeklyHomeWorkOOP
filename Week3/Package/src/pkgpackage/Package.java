package pkgpackage;


public class Package {

    private BoxSize boxsize;
    private double weight;
    private Person sender;
    private Person recipient;
    private String URL;
    
    
    public Package(BoxSize boxsize, double weight, Person sender, Person recipient, String URL){
        this.boxsize   = boxsize;
        this.weight    = weight;
        this.sender    = sender;
        this.recipient = recipient;
        this.URL       = URL;
    }
    
}
