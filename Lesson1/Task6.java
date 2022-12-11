package Lesson1;
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Task6 {
    public static void main(String[] args) {
        Task6 task = new Task6();
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        task.ShowArray(array);
        System.out.println();
        task.ChangeArray(array);

    }

    public void ChangeArray(int [] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        ShowArray(array);
    }

    public void ShowArray(int[] array)
    {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
}
