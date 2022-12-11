package Lesson1;

import java.util.Scanner;

//Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.PositivOrNegativ()); 
    }

    public boolean PositivOrNegativ(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
    int number1 = Integer.valueOf(scan.nextLine());
    scan.close();

    if(number1 >= 0) return false;
    else return true;
    }
}
