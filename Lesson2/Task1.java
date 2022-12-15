package Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
      Task1 task1 = new Task1();
      task1.ChackSum();
    }

    public void ChackSum(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String str = scan.nextLine();
    scan.close();
    CheckString(str);
    }

    public void CheckString (String str){
      List<Character> chars = new ArrayList<>();
      for(char ch: str.toCharArray()){
     chars.add(ch);
      }
      System.out.println(chars);
     for (int i = 0; i < chars.size() / 2; i++){
      System.out.print(chars.get(i));
        System.out.println( chars.get(chars.size() - i -1));
       if(chars.get(i) != chars.get(chars.size() - i -1)){
        System.out.println("не полиндром");
        break;}
        if(i == (chars.size()/2 -1)) System.out.println("полиндром");
       }
       
      } 
     }
    
