package Lesson1;

import java.util.Scanner;

//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
public class Task10 {
    public static void main(String[] args) {
        Task10 task = new Task10();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int len = Integer.valueOf(scan.nextLine());
        System.out.println("Введите содержимое ячейки: ");
        String initialValue = scan.nextLine();
        scan.close();
        task.ShowArray(task.CellFilling(len, initialValue));
    }

    public String [] CellFilling(int len, String initialValue){
        String [] array = new String [len];
        for( int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

    public void ShowArray(String [] array)
    {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
