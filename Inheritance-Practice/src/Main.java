

public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Mike", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        PastEvents pastEvent = new PastEvents("E001", "AI Conference", "Paris", "Mike", 50, 2);
        String paymentDetails = pastEvent.getPaymentDetails();
        System.out.println(paymentDetails);
        System.out.println(pastEvent);
    }
}
