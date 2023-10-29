public class SportsEvent implements Event {
    private String eventName;
    private String details;

    public SportsEvent(String eventName, String details) {
        this.eventName = eventName;
        this.details = details;
    }

    public String getEventDetails() {
        return "Sport Event: " + eventName + ", " + details;
    }

    public void updateEventDetails(String newDetails) {
        this.details = newDetails;
    }

    public void manageGuestList() {
        System.out.println("Managing the guest list for the Music Event");
    }
}
