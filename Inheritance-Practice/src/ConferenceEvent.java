public class ConferenceEvent  {

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {

        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
        this.calculateEventCostObject = new CalculateEventCostClass();

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

    public double getBreakfastCost() {
        return breakfastCost;
    }
    public void setBreakfastCost(double breakfastCost) {
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost() {
        return lunchCost;
    }
    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost() {
        return dinnerCost;
    }
    public void setDinnerCost(double dinnerCost) {
        this.dinnerCost = dinnerCost;
    }


    public void calculateEventCost() {
        eventCost = calculateEventCostObject.calculateEventCost() + ((breakfastCost + lunchCost + dinnerCost) + getTotalParticipants() *getTotalEventDays());
       
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
                "BreakfastRequired: " + breakfastRequired + "\n" +
                "BreakfastCost: " + breakfastCost + "\n" +
                "LunchRequired: " + lunchRequired + "\n" +
                "LunchCost: " + lunchCost + "\n" + 
                "DinnerRequired: " + dinnerRequired + "\n" +
                "DinnerCost: " + dinnerCost + "\n" + 
                "Conference Event totalCost: " + eventCost;
    }
}