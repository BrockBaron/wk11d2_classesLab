import java.util.ArrayList;

public class BusStop {

    String name;
    ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }


    public void addToQ(Person person) {
        this.queue.add(person);
    }

    public int getStopCount() {
        return this.queue.size();
    }

    public void removeFromQ() {
        this.queue.remove(0);
    }
}
