public class EventAttendee {
    private String name;

    public EventAttendee(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }

    public String getName() {
        return name;
    }
}
