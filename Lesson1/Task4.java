package Lesson1;

import java.util.Scanner;

//Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку число: ");
    String string = scan.nextLine();
    System.out.println("Введите число: ");
    int number = Integer.valueOf(scan.nextLine());
    scan.close();
    Task4 task4 = new Task4();
    task4.PrintString(number, string);
    }



    public void PrintString(int number, String string){
        for(int i = 1; i <= number; i++){
            System.out.println(string);
        }
    }
}
