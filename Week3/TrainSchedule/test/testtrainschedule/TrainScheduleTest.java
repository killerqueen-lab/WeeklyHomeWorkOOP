package testtrainschedule;

import junit.framework.TestCase;
import trainschedule.AList;
import trainschedule.Cons;
import trainschedule.Empty;
import trainschedule.Express;
import trainschedule.KindOfTrain;
import trainschedule.Local;
import trainschedule.Location;
import trainschedule.Schedule;
import trainschedule.Station;
import trainschedule.Stops;
import trainschedule.Time;

public class TrainScheduleTest extends TestCase {
    public void testLocalScheduleConstructor() {
        Station departure = new Station("Central", new Location("Main Street", "1st Avenue"));
        Station destination = new Station("Airport", new Location("Airport Road", "2nd Avenue"));
        AList stops = new Cons(new Stops(new Station("Market", new Location("Market Street", "3rd Avenue"))),
                               new Empty());
        KindOfTrain local = new Local(1.50, 4);

        new Schedule(departure, destination, new Time(8, 15), new Time(9, 0), stops, local);
    }

    public void testExpressScheduleConstructor() {
        Station departure = new Station("Central", new Location("Main Street", "1st Avenue"));
        Station destination = new Station("Harbor", new Location("Port Street", "5th Avenue"));
        KindOfTrain express = new Express(3.00, 8);

        new Schedule(departure, destination, new Time(10, 30), new Time(11, 10),
                     new Empty(), express);
    }
}
