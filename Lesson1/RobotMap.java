package Lesson1;
import java.util.*;

public class RobotMap {

    private final int n;
    private final int m;
    private final List<Robot> robots;

    public RobotMap(int n, int m, int maxRobotCount) {
        // TODO: 13.01.2023 Реализовать проверку входных параметров.
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
    }

    public Robot createRobot(Point point) throws RobotCreationException  {
        final MapPoint robotPosition;
        try {
            validatePoint(point);
            robotPosition = new MapPoint(point.getX(), point.getY());
        } catch (PointValidationException e) {
            throw new RobotCreationException(e.getMessage());
        }

        Robot robot = new Robot(robotPosition);
        robots.add(robot);
        return robot;
    }

    private void validatePoint(Point point) throws PointValidationException {
        validatePointIsFree(point);
    }

    private void validatePointIsFree(Point point) throws PointValidationException {
        for (Robot robot : robots) {
            if (point.equals(robot.getPoint())) {
                throw new PointValidationException("Позиция " + point + " занята другим роботом: " + robot);
            }
        }
    }

    public static final Direction DEFAULT_DIRECTION = Direction.TOP;

    public class Robot {

       

        private final UUID id;
        private MapPoint point;
        private Direction direction;

        public Robot(MapPoint point) {
            this.id = UUID.randomUUID();
            this.point = point;
            this.direction = DEFAULT_DIRECTION;
        }

        public void move() throws RobotMoveException {
            final MapPoint newPoint;
            try {
                switch (direction) {
                    case TOP:  newPoint = new MapPoint(point.getX() - 1, point.getY());
                    break;
                    case RIGHT: newPoint = new MapPoint(point.getX(), point.getY() + 1);
                    break;
                    case BOTTOM: newPoint = new MapPoint(point.getX() + 1, point.getY());
                    break;
                    case LEFT: newPoint = new MapPoint(point.getX(), point.getY() - 1);
                    break;
                    default: newPoint = new MapPoint(point.getX() - 1, point.getY());
                }
                 
                validatePoint(newPoint);
            } catch (PointValidationException e) {
                throw new RobotMoveException(e.getMessage(), this);
            }

            this.point = newPoint;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public MapPoint getPoint() {
            return point;
        }

        @Override
        public String toString() {
            return "Robot-" + id + point;
        }
    }

    public class MapPoint extends Point {

        public MapPoint(int x, int y) throws PointValidationException {
            super(x, y);

            if (x < 0 || x > n || y < 0 || y > m) {
                throw new PointValidationException("Недопустимое значение Point: " + this);
            }
        }
    }

}