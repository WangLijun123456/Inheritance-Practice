public class ConferenceEvent extends Events{

    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;


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


    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.calculateEventCost();
        if (breakfastRequired) {
            totalCost += breakfastCost * getTotalParticipants();
        }
        if (lunchRequired) {
            totalCost += lunchCost * getTotalParticipants();
        }
        if (dinnerRequired) {
            totalCost += dinnerCost * getTotalParticipants();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Breakfast Required: " + breakfastRequired + "\n" +
        "Breakfast Cost: " + breakfastCost + "\n" +
        "Lunch Required: " + lunchRequired + "\n" +
        "Lunch Cost: " + lunchCost + "\n" +
        "Dinner Required: " + dinnerRequired + "\n" +
        "Dinner Cost: " + dinnerCost + "\n" +
        "Total Cost: " + calculateEventCost();
    }
}