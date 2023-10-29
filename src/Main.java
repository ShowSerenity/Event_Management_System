import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<EventOrganizer> organizers = new ArrayList<>();
        List<EventAttendee> attendees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Music Event Organizer");
            System.out.println("2. Create Conference Event Organizer");
            System.out.println("3. Create Sports Event Organizer");
            System.out.println("4. Create Event Attendee");
            System.out.println("5. Add Attendee to Organizer");
            System.out.println("6. Remove Attendee from Organizer");
            System.out.println("7. Create Event");
            System.out.println("8. Update Event");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Music Event Organizer name: ");
                    String musicOrganizerName = scanner.nextLine();
                    MusicEventOrganizer musicOrganizer = new MusicEventOrganizer(musicOrganizerName);
                    organizers.add(musicOrganizer);
                    break;

                case 2:
                    System.out.print("Enter Conference Event Organizer name: ");
                    String conferenceOrganizerName = scanner.nextLine();
                    ConferenceEventOrganizer conferenceOrganizer = new ConferenceEventOrganizer(conferenceOrganizerName);
                    organizers.add(conferenceOrganizer);
                    break;

                case 3:
                    System.out.print("Enter Sports Event Organizer name: ");
                    String sportsOrganizerName = scanner.nextLine();
                    SportsEventOrganizer sportsOrganizer = new SportsEventOrganizer(sportsOrganizerName);
                    organizers.add(sportsOrganizer);
                    break;

                case 4:
                    System.out.print("Enter Attendee name: ");
                    String attendeeName = scanner.nextLine();
                    EventAttendee attendee = new EventAttendee(attendeeName);
                    attendees.add(attendee);
                    break;

                case 5:
                    addAttendeeToOrganizer(organizers, attendees, scanner);
                    break;

                case 6:
                    removeAttendeeFromOrganizer(organizers, attendees, scanner);
                    break;

                case 7:
                    createEvent(organizers, scanner);
                    break;

                case 8:
                    updateEvent(organizers, scanner);
                    break;

                case 9:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addAttendeeToOrganizer(List<EventOrganizer> organizers, List<EventAttendee> attendees, Scanner scanner) {
        System.out.println("Event Organizers:");
        for (int i = 0; i < organizers.size(); i++) {
            System.out.println(i + ". " + organizers.get(i).getName());
        }

        System.out.println("Event Attendees:");
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println(i + ". " + attendees.get(i).getName());
        }

        System.out.print("Enter the index of the Event Organizer: ");
        int organizerIndex = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the index of the Event Attendee to add: ");
        int attendeeIndex = scanner.nextInt();
        scanner.nextLine();

        if (organizerIndex >= 0 && organizerIndex < organizers.size() &&
                attendeeIndex >= 0 && attendeeIndex < attendees.size()) {
            organizers.get(organizerIndex).addObserver(attendees.get(attendeeIndex));
            System.out.println("Attendee added to the Event Organizer.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void removeAttendeeFromOrganizer(List<EventOrganizer> organizers, List<EventAttendee> attendees, Scanner scanner) {
        System.out.println("Event Organizers:");
        for (int i = 0; i < organizers.size(); i++) {
            System.out.println(i + ". " + organizers.get(i).getName());
        }

        System.out.println("Event Attendees:");
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println(i + ". " + attendees.get(i).getName());
        }

        System.out.print("Enter the index of the Event Organizer: ");
        int organizerIndex = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the index of the Event Attendee to remove: ");
        int attendeeIndex = scanner.nextInt();
        scanner.nextLine();

        if (organizerIndex >= 0 && organizerIndex < organizers.size() &&
                attendeeIndex >= 0 && attendeeIndex < attendees.size()) {
            organizers.get(organizerIndex).removeObserver(attendees.get(attendeeIndex));
            System.out.println("Attendee removed from the Event Organizer.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void createEvent(List<EventOrganizer> organizers, Scanner scanner) {
        System.out.println("Event Organizers:");
        for (int i = 0; i < organizers.size(); i++) {
            System.out.println(i + ". " + organizers.get(i).getName());
        }

        System.out.print("Enter the index of the Event Organizer: ");
        int organizerIndex = scanner.nextInt();
        scanner.nextLine();

        if (organizerIndex >= 0 && organizerIndex < organizers.size()) {
            System.out.print("Enter Event name: ");
            String eventName = scanner.nextLine();
            organizers.get(organizerIndex).createEvent(eventName);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void updateEvent(List<EventOrganizer> organizers, Scanner scanner) {
        System.out.println("Event Organizers:");
        for (int i = 0; i < organizers.size(); i++) {
            System.out.println(i + ". " + organizers.get(i).getName());
        }

        System.out.print("Enter the index of the Event Organizer: ");
        int organizerIndex = scanner.nextInt();
        scanner.nextLine();

        if (organizerIndex >= 0 && organizerIndex < organizers.size()) {
            System.out.print("Enter new Event details: ");
            String eventDetails = scanner.nextLine();
            organizers.get(organizerIndex).updateEvent(eventDetails);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}
