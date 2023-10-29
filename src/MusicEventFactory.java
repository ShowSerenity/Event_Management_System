public class MusicEventFactory implements EventFactory {
    public Event createEvent(String eventName, String details) {
        return new MusicEvent(eventName, details);
    }
}
