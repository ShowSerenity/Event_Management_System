public class MusicEventOrganizer extends EventOrganizer {
    public MusicEventOrganizer(String eventName) {
        super(eventName);
    }

    public void createEvent(String details) {
        System.out.println("Music Event created: " + details);
        notifyObservers("New Music Event created");
    }

    public void updateEvent(String newDetails) {
        System.out.println("Music Event updated: " + newDetails);
        notifyObservers("Music Event details updated");
    }

    public void manageGuestList() {
        System.out.println("Managing the guest list for the Music Event");
    }
}
