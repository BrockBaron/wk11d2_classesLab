import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
       busStop = new BusStop("124");
       person = new Person();
        busStop.addToQ(person);
    }

    @Test
    public void addPersonToQ(){
        busStop.addToQ(person);
        assertEquals(2, busStop.getStopCount());
    }

    @Test
    public void name() {
        busStop.removeFromQ();
        assertEquals(0, busStop.getStopCount());
    }
}
