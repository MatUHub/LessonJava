package Lesson3;
//Пусть дан произвольный список целых чисел, удалить из него четные числа.
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(3);
        number.add(8);
        number.add(7);
        number.add(3);
        number.add(4);
        number.add(7);
        number.add(6);
        number.add(3);

       Task1 task = new Task1();
       System.out.println("Список чисел");
       task.ShowList(number);
       task.EvenNumbers(number);
       System.out.println("Список без четных чисел ");
       task.ShowList(number);
    }

    void ShowList(ArrayList<Integer> arr){
        System.out.println(arr);
    }

    void EvenNumbers(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i)%2 == 0) arr.remove(i);
        }
    }
    
}
