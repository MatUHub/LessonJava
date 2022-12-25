package Lesson5;
import java.io.IOException;
//Пусть дан произвольный список целых чисел, удалить из него четные числа.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Васильев", "321456");
        phoneBook.add("Петрова", "234561");
        phoneBook.add("Иванов", "234432");
        phoneBook.add("Петрова", "654321");
        phoneBook.add("Иванов", "345678");

        phoneBook.getBySurname("Иванов").forEach((number)->System.out.println(number));
        
    }


}

class PhoneBook{
    private HashMap<String, ArrayList<String>> storage = new HashMap<>();
    
    public void add(String surname, String phoneNumber){
        if(storage.containsKey(surname)){
            storage.get(surname).add(phoneNumber);
        } else{
            ArrayList<String> arr = new ArrayList<>();
            arr.add(phoneNumber);
            storage.put(surname, arr);
        }
    }

    public ArrayList<String> getBySurname(String surname){
    return storage.get(surname);
    }
}

    

