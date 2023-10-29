public class SportsEventOrganizer extends EventOrganizer {
    public SportsEventOrganizer(String eventName) {
        super(eventName);
    }

    public void createEvent(String details) {
        System.out.println("Sports Event created: " + details);
        notifyObservers("New Sports Event created");
    }

    public void updateEvent(String newDetails) {
        System.out.println("Sports Event updated: " + newDetails);
        notifyObservers("Sports Event details updated");
    }

    public void manageGuestList() {
        System.out.println("Managing the guest list for the Sports Event");
    }
}
