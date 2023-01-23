package Lesson2;

public class Game {

    public static void main(String[] args) {
        Participant[] participants = creatParticipants();
        Obstacle[] obstacles = createObstacles();

for(Participant participant: participants){
    for(Obstacle obstacle : obstacles){
        boolean overcome =  obstacle.overcome(participant);
        if (overcome){
            System.out.println(participant.getName() + "переодолел препятствие " + obstacle.getType());
        }
    }
}

    }

    private static Participant[] creatParticipants(){
        
        return new Participant[] {
            new Cat("Cat1", 15, 5),
            new Cat("Cat2", 10, 7),
            new Cat("Cat3", 8, 10),
            new Human("Human-1", 5, 5, 5),
            new Human("Human-2", 10, 10, 10),
            new Human("Human-3", 15, 15, 15),
            new SuperHuman("superHuman")
    };
}

    private static Obstacle[] createObstacles(){
        return new Obstacle[]{
            new Road(7),
            new SwimmingPool(9),
          
        };
        }
    }
    
    

