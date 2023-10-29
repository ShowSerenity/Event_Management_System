public class ConferenceEventFactory implements EventFactory {
    public Event createEvent(String eventName, String details) {
        return new ConferenceEvent(eventName, details);
    }
}
