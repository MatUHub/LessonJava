package Lesson6;

public class Cat {
    private int razmerSitosty;
   private int sitost;

   public  Cat(int razmerSitosty){
       this.razmerSitosty = razmerSitosty;
   }
    public void eat(int countCorm){
        if (razmerSitosty <= countCorm){
            System.out.println("кот сытый");
            sitost = countCorm - razmerSitosty;
            System.out.println("корма осталось " + sitost);
            return;
        }
        if(razmerSitosty > countCorm){
            System.out.println("Кот не наелся");
            sitost = razmerSitosty - countCorm;
            System.out.println("не хватает корма "  + sitost);
        }

    }

    }
