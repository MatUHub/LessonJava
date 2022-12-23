package Lesson4;
import java.io.IOException;
//Пусть дан произвольный список целых чисел, удалить из него четные числа.
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        ArrayList<String> number = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);
        String str = new String();
        String [] words = {};
        while (!str.equals("quit"))
        {
            System.out.print("введиет строку:");
            str = scan.nextLine();
            words = str.split("~");
            System.out.println(words.length);
                number.add((Integer.valueOf(words[1])), words[0]);
           
            }
        }
      
        
    }

    

