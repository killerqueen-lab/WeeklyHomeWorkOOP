package trainschedule;

public abstract class KindOfTrain {
    protected double price;
    protected int carriageNumber;

    public KindOfTrain(double price, int carriageNumber) {
        this.price = price;
        this.carriageNumber = carriageNumber;
    }
}
