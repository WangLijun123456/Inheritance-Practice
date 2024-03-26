import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Mike", 5000, 10, 3, true, 10, true, 10, true, 10);
        conferenceEvent.calculateEventCost();
        System.out.println("\nConference Event Details:");
        System.out.println(conferenceEvent);
     
        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E002", "Rock Concert", "Outdoor Stadium", "Jane Smith", 5000, 10, 3, true, 10);
        musicConcertEvent.calculateEventCost();
        System.out.println("\nMusic Concert Event Details:");
        System.out.println(musicConcertEvent);

        PastEvents pastEvent = new PastEvents("E003", "Convention Center", "Paris", "Mike", 20, 20, LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 28), "Paid", false);
        System.out.println("\nPast Event Details:");
        System.out.println(pastEvent);
    }
}
