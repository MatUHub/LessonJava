package Lesson4;

import javax.sound.sampled.SourceDataLine;

public class Homework {

    public static void main(String[] args) {
 Box<Apple> apples = new Box();
 apples.addBox(new Apple(1));
 apples.addBox(new Apple(2));
 apples.addBox(new Apple(3));
 apples.addBox(new GoldApple(3));
 System.out.println(apples.getWeightBox() );

 Box<Orange> orangeBox = new Box();
 orangeBox.addBox(new Orange(1));
 System.out.println(orangeBox.getWeightBox());

 Box<GoldApple> goldenAppleBox = new Box();
goldenAppleBox.addBox(new GoldApple(2));
goldenAppleBox.addBox(new GoldApple(3));
System.out.println(goldenAppleBox.getWeightBox());

 

}
 

    
    }