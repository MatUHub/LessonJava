package Lesson2;

public class SwimmingPool implements Obstacle {
    private final int distance;
    public SwimmingPool(int distance){this.distance = distance;}
    public int getDistance(){return distance;}
    
    @Override
    public boolean overcome(Participant participant) {
       int swimLimit = participant.getSwimLimit();
       return swimLimit >= distance;
       }
       @Override
       public String getType() {
           return "Стена";
       }
    }
    

