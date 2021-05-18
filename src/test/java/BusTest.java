import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Edinburgh", 0);
        person = new Person();
        busStop = new BusStop("124");
        busStop.addToQ(person);
    }

    @Test
    public void getPassengerOnBus() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canGetAddPassengerToBus() {
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());
    }

@Test
    public void addPassengerToBusIfThereIsCapacity() {
        busStop.addToQ(person);
        busStop.addToQ(person);
        busStop.addToQ(person);
        busStop.addToQ(person);
        busStop.addToQ(person);
        busStop.addToQ(person);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(5, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassengerFromBus() {
        busStop.addToQ(person);
        busStop.addToQ(person);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(1, bus.getPassengerCount());
    }
}
