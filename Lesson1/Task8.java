package Lesson1;
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
public class Task8 {
    public static void main(String[] args) {
        Task8 task = new Task8();
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task.ShowArray(array);
        System.out.println();
        task.ChangeArray(array);

    }

    public void ChangeArray(int [] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6) array[i] = array[i] * 2;
        }
        ShowArray(array);
    }

    public void ShowArray(int[] array)
    {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
