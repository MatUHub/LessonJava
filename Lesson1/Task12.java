package Lesson1;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Task12 {
    public static void main(String[] args) {
        Task12 task = new Task12();
        int [] array = {1, 4, 5, 7, 11, 36, 4, 2, 1, 6, 7, 23};
        task.FindMaxMin(array);
    }

    public void FindMaxMin(int [] array){
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
         if (max < array[i]) max = array[i];
         if (min > array[i]) min = array[i];
        }
        System.out.println("максимальное значение " + max);
        System.out.println("минимальное значение " + min);


    }


}
