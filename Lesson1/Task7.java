package Lesson1;
//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
public class Task7 {
    public static void main(String[] args) {
        Task7 task = new Task7();
        int [] array = new int [100];
        for(int i = 0; i < 100; i++){
            array[i] = i+1;
        }
        task.ShowArray(array);
        
    }

    public void ShowArray(int[] array)
    {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
