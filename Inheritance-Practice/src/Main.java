public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Mike", 100, 10, 10, true, 10, true, 10, true, 10);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E002", "Rock Concert", "Outdoor Stadium", "Jane Smith", 5000, 500, 1, true, 10);
        System.out.println("\nMusic Concert Event Details:");
        System.out.println(musicConcertEvent);
    }
}