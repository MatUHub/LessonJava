package Lesson2;

public class Wall {

    private final int height;
    public Wall( int height){ this.height = height;}
    public int getHeight(){return height;}
    
    
    public boolean overcome(Jumpable jumpable) {
       int jumpLimit = jumpable.getJumpLimit();
       return jumpLimit >= height;
        
       }
        
    }

