package Lesson3;

import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
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

       Task2 task = new Task2();
       task.MaxAndMinNum(number);
    }

    void MaxAndMinNum(ArrayList<Integer> arr){
        int max = arr.get(0);
        int min = arr.get(0);
        int arifm = 0;
        for (int i = 0; i < arr.size(); i++){
           if (max < arr.get(i)) max = arr.get(i);
           if (min > arr.get(i)) min = arr.get(i);
           arifm = arifm + arr.get(i);
        }
        System.out.println("Максимальное значение:");
        System.out.println(max);
        System.out.println("Минимальное значение:");
        System.out.println(min);
        System.out.println("Среднее арифметическое значение:");
        System.out.println(arifm/arr.size());
    }
}
