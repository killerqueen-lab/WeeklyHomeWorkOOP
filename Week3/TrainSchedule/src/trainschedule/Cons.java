package trainschedule;


public class Cons extends AList {
    private Stops first;
    private AList rest;

    public Cons(Stops first, AList rest) {
        this.first = first;
        this.rest = rest;
    }
}
