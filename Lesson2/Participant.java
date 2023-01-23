 package Lesson2;
 public abstract class Participant implements Runnable, Jumpable, Swimmable{
    private final String name;
    private final int distanceLimit;
    private final int jumpLimit;
    private final int swimLimit;

    public Participant(String name, int distanceLimit, int jumpLimit, int swimLimit){
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    public String getName(){
        return name;
    }

    public void overcome(Obstacle obstacle){

    }

    public int getDistanceLimit() {
        return distanceLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }
 }