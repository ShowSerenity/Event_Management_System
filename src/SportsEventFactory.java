public class SportsEventFactory implements EventFactory {
    public Event createEvent(String eventName, String details) {
        return new SportsEvent(eventName, details);
    }
}
