public class ConferenceEvent extends Event{

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


        public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double breakfastCost, double lunchCost, double dinnerCost){
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    }


        @Override
        public abstract void calculateEventCost();
            
        
        
    
        @Override
        public String toString() {
            return super.toString() + "\n" +
            "Breakfast Required: " + breakfastRequired + "\n" +
            "Breakfast Cost: " + breakfastCost + "\n" +
            "Lunch Required: " + lunchRequired + "\n" +
            "Lunch Cost: " + lunchCost + "\n" +
            "Dinner Required: " + dinnerRequired + "\n" +
            "Dinner Cost: " + dinnerCost + "\n" ;
            //"Total Cost: " + calculateEventCost();
        }
    }
    
