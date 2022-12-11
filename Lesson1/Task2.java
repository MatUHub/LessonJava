package Lesson1;
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.PositivOrNegativ()); 
    }

    public String PositivOrNegativ(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
    int number1 = Integer.valueOf(scan.nextLine());
    scan.close();
    

    if(number1 >= 0) return "Число положительное";
    else return "Число отрицательное";
    
    }
}
