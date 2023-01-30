package Lesson4;

import java.util.ArrayList;

public class Box <T extends Fruit>{
ArrayList<T> arr = new ArrayList<T>();
    public void addBox (T fruit){
    arr.add(fruit);
    }


    public double getWeightBox() {
        double sum = 0;
        for (T t : arr) {
            sum = t.getWeight() + sum;
        }
        return sum;
    }

    public void moveTo(Box<T> fruit){
        for ( T a : this.arr){
            fruit.addBox(a);
        }
        this.arr.clear();
    }
    
}
