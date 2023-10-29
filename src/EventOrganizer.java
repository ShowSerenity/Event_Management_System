import java.util.ArrayList;
import java.util.List;

public abstract class EventOrganizer {
    private String eventName;
    private List<EventAttendee> observers = new ArrayList<>();

    public EventOrganizer(String eventName) {
        this.eventName = eventName;
    }

    public void addObserver(EventAttendee observer) {
        observers.add(observer);
    }

    public void removeObserver(EventAttendee observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (EventAttendee observer : observers) {
            observer.update(eventName + ": " + message);
        }
    }

    public abstract void createEvent(String details);

    public abstract void updateEvent(String newDetails);

    public abstract void manageGuestList();

    public String getName() {
        return eventName;
    }
}
