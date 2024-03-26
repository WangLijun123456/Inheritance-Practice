import java.time.LocalDate;

public  class PastEvents {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;

public PastEvents(String eventID, String eventName, String eventLocation, String  eventPointOfContact, int totalParticipants, int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate,String paymentStatus, boolean requiresExtension) {
    this.eventID = eventID;
    this.eventName = eventName;
    this.eventLocation = eventLocation;
    this.eventPointOfContact = eventPointOfContact;
    this.totalParticipants = totalParticipants;
    this.totalEventDays = totalEventDays;
    this.eventStartDate = eventStartDate;
    this.eventEndDate = eventEndDate;
    this.paymentStatus = paymentStatus;
    this.requiresExtension = requiresExtension;
    }

    public  String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    public String getEventpointOfContact() {
        return eventPointOfContact;
    }
    public void setPointOfContact(String eventPointOfContact) {
        this.eventPointOfContact = eventPointOfContact;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }
    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }
   
    public int getTotalEventDays() {
        return totalEventDays;
    }    
    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }

    public String getPaymentDetails() {
        return String.format("The event cost was %.2f and the payment status is %s. The Customer requires extension?: %b.", eventCost, paymentStatus, requiresExtension );
    }

    @Override
    public String toString() {
        return  "Event ID: " + eventID + "\n" +
                "Event Name: " + eventName + "\n" +
                "Location: " + eventLocation + "\n" +
                "Point of Contact: " + eventPointOfContact + "\n" +
                "Total Participants: " + totalParticipants + "\n" +
                "Total Event Days: " + totalEventDays + "\n" +
                "Event Start Date: " + eventStartDate + "\n" +
                "Event End Date: " + eventEndDate + "\n" +
                "Payment Status: " + paymentStatus + "\n" +
                "Requires Extension: " + requiresExtension + "\n" +
                "Payment Details: " + getPaymentDetails();
    }
}