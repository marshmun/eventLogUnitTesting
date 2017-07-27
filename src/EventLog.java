import java.util.List;

public class EventLog {

    private List <Event> eventList;

    public boolean addEvent(Event event) {
        return false;
    }

    public int getNumEvents() {
        return eventList.size();
    }

    public EventLog() {

    }


}
//    public int getNumEvents () //which returns the size of the list
//    public EventLog () which initializes the list
