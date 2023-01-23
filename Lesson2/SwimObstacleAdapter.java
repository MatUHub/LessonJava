package Lesson2;

public class SwimObstacleAdapter implements Obstacle{
    private final SwimmingPool swim;

    public SwimObstacleAdapter(SwimmingPool swim){
        this.swim = swim;
    }

    @Override
    public boolean overcome(Participant participant) {
        return swim.overcome(participant);
        
    }

    @Override
    public String getType() {
        
        return "Pool";
    }
    
}
