package Lesson1;

import java.util.Scanner;

//Написать метод, принимающий на вход два целых числа и проверяющий, 
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, 
//в противном случае – false.
public class Task1{
    public static void main(String[] args) {
      Task1 task1 = new Task1();
      task1.ChackSum();
    }

    public void ChackSum(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int number1 = Integer.valueOf(scan.nextLine());
    System.out.println("Введите второе число: ");
    int number2 = Integer.valueOf(scan.nextLine());
    System.out.println(SumNumbers(number1, number2));
    scan.close();
    }

    public boolean SumNumbers(int number1, int number2){
    int result = number1 + number2;
    if (result >= 10 && result <= 20) return true;
    else return false;
    }
}