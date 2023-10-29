public class MusicEvent implements Event {
    private String eventName;
    private String details;

    public MusicEvent(String eventName, String details) {
        this.eventName = eventName;
        this.details = details;
    }

    public String getEventDetails() {
        return "Music Event: " + eventName + ", " + details;
    }

    public void updateEventDetails(String newDetails) {
        this.details = newDetails;
    }

    public void manageGuestList() {
        System.out.println("Managing the guest list for the Music Event");
    }
}
