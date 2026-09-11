package trainschedule;

/** Base class for the kinds of train shown in the schedule. */
public abstract class KindOfTrain {
    protected double price;
    protected int carriageNumber;

    public KindOfTrain(double price, int carriageNumber) {
        this.price = price;
        this.carriageNumber = carriageNumber;
    }
}
