package Lesson1;

public class Main {

    public static void main(String[] args) {
 

        RobotMap map = new RobotMap(100, 100, 15);
        try {
            RobotMap.Robot robot1 = map.createRobot(new Point(-3, 5));
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        }
        try {
            RobotMap.Robot robot2 = map.createRobot(new Point(4, 5)); 
            robot2.changeDirection(Direction.BOTTOM);
            robot2.move();
            System.out.println(robot2);
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        } catch (RobotMoveException e) {
            System.err.println("Не удалось сдвинуть робота с места!");
        }

        try {
            RobotMap.Robot robot = map.createRobot(new Point(100, 100));
            robot.changeDirection(Direction.BOTTOM);
            robot.move();
            System.out.println(robot);
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        } catch (RobotMoveException e) {
            System.err.println("Не удалось сдвинуть робота " + e.getRobot() + " с места!");
        }


    }

}