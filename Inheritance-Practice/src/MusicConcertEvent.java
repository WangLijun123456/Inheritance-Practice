public class MusicConcertEvent extends Event {
    
    private boolean merchandiseRequired;
    private double merchandiseCost;


    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseCost = merchandiseCost;
        this.merchandiseRequired = merchandiseRequired;
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

    @Override
    public void calculateEventCost() {
    
    }
   
    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Merchandise Required: " + merchandiseRequired + "\n" +
        "Merchandise Cost: " + merchandiseCost;
    }
}