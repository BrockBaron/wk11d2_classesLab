import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = 5;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if(getPassengerCount() < this.capacity){
            Person person = busStop.removeFromQ();
            passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
