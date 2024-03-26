import java.time.LocalDate;

public  class PastEvents extends Event {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;

    public PastEvents(String eventID, String eventName, String eventLocation, String  eventPointOfContact, int totalParticipants, int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate,String paymentStatus, boolean requiresExtension) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }

    public String getPaymentDetails() {
        return String.format("The event cost was %.2f and the payment status is %s. The Customer requires extension?: %b.", eventCost, paymentStatus, requiresExtension );
    }

    @Override
    public String toString() {
        return  "Event ID: " + getEventID() + "\n" +
                "Event Name: " + getEventName() + "\n" +
                "Event Location: " + getEventLocation() + "\n" +
                "Event Start Date: " + eventStartDate + "\n" +
                "Event End Date: " + eventEndDate + "\n" +
                "Payment Status: " + paymentStatus + "\n" +
                "Requires Extension: " + requiresExtension + "\n" +
                "Payment Details: " + getPaymentDetails();
    }

    @Override
    public void calculateEventCost() {
       
    }

}