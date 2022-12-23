package Lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args){
        LinkedList<String> number = new LinkedList<>();
        number.add("a");
        number.add("b");
        number.add("c");
        number.add("d");
        number.add("e");
        number.add("f");

      ListIterator<String> listIter = number.listIterator(number.size());

      while(listIter.hasPrevious()){
        System.out.println(listIter.previous());
      }
    }

   
    }

