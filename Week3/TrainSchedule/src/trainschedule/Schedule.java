package trainschedule;

public class Schedule {
    private Station departure;
    private Station destination;
    private Time departureTime;
    private Time arrivalTime;
    private AList stops;
    private KindOfTrain kindOfTrain;

    public Schedule(Station departure, Station destination,
                    Time departureTime, Time arrivalTime,
                    AList stops, KindOfTrain kindOfTrain) {
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.stops = stops;
        this.kindOfTrain = kindOfTrain;
    }
}
