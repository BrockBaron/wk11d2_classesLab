import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;


    @Before
    public void before(){
        bus = new Bus("Edinburgh", 0);
        person = new Person();
    }

    @Test
    public void getPassengerOnBus() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canGetAddPassengerToBus() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

//    @Test
    public void addPassengerToBusIfThereIsCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(6, bus.getPassengerCount());

    }
}
