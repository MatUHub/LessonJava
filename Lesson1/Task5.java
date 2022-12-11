package Lesson1;

import java.util.Scanner;

//Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println(task5.ChackYear(task5.EnterNumber()));
    }

    public int EnterNumber(){
        Scanner scan = new Scanner(System.in);
    System.out.println("Введите год: ");
    int number = Integer.valueOf(scan.nextLine());
    scan.close();
    return number;
    }

    public boolean ChackYear(int number){
        if (number%400 == 0){
            return true;
        }
        if (number%100 == 0){
            return false;
        }

        if (number%4 == 0){
            return true;
        } else return false;
    }
}
