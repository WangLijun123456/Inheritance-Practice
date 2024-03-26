public class MusicConcertEvent {
    
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private CalculateEventCostClass calculateEventCostObject;


    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.merchandiseCost = merchandiseCost;
        this.merchandiseRequired = merchandiseRequired;
        this.calculateEventCostObject = new CalculateEventCostClass();
    }


    public String getEventID() {
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

    public boolean getMerchandiseRequired() {
        return merchandiseRequired;
    }
    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }
    public double getMerchandiseCost() {
        return merchandiseCost;
    }
    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }

    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject) {
        this.calculateEventCostObject = calculateEventCostObject;
    }

    public void calculateEventCost() {
        eventCost = calculateEventCostObject.calculateEventCost() + (getMerchandiseCost() * getTotalParticipants()) * getTotalEventDays() ;
       
    }
   
    @Override
    public String toString() {
        return
        "Event ID: " + eventID + "\n" +
        "Event Name: " + eventName + "\n" +
        "Location: " + eventLocation + "\n" +
        "Point of Contact: " + eventPointOfContact + "\n" +
        "Event Cost: " + eventCost + "\n" +
        "Total Participants: " + totalParticipants + "\n" +
        "Total Event Days: " + totalEventDays + "\n" +
        "Merchandise Required: " + merchandiseRequired + "\n" +
        "Merchandise Cost: " + merchandiseCost + "\n" +
        "Music Concert Event totalCost: "+ eventCost;
    }
}