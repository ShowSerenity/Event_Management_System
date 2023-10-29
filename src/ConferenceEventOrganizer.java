public class ConferenceEventOrganizer extends EventOrganizer {
    public ConferenceEventOrganizer(String eventName) {
        super(eventName);
    }

    public void createEvent(String details) {
        System.out.println("Conference created: " + details);
        notifyObservers("New Conference created");
    }

    public void updateEvent(String newDetails) {
        System.out.println("Conference updated: " + newDetails);
        notifyObservers("Conference details updated");
    }

    public void manageGuestList() {
        System.out.println("Managing the guest list for the Conference");
    }
}
