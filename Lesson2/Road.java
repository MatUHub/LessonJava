package Lesson2;

public class Road implements Obstacle {
    private final int distance;

    public Road(int distance) {this.distance = distance;}

    public int getDistance() {return distance;}

    @Override
    public boolean overcome(Participant participant) {
       int distanceLimit = participant.getDistanceLimit();
       return distanceLimit >= distance;
       }
        


    @Override
    public String getType() {
        return "Стена";
    }
    
}
