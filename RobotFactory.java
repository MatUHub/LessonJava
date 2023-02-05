import DefaultRobotMap.MapPoint;

public class RobotFactory {
    public Robot create(MapPoint point) {
        return new DefaultRobot(MapPoint point);
    }
    
}
