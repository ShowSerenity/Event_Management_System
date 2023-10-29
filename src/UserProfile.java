import java.util.ArrayList;
import java.util.List;

public class UserProfile extends EventAttendee {
    private List<String> notifications = new ArrayList<>();

    public UserProfile(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        notifications.add(message);
        System.out.println(getName() + " received a notification: " + message);
    }
}
