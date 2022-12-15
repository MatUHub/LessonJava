package Lesson2;
import java.nio.file.Files;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws IOException {
         Path file = Paths.get("");
         List<Path> direct = Files.list(file).collect(Collectors.toList());
         for(int i = 0; i < direct.size(); i++){
            Path p = direct.get(i);
            String a = p.toString();
            String[] arr = a.split(".");
            if (arr.length > 0) System.out.println("Расширение файла: " + arr[0]);
            else System.out.println("Расшиериня файла: ");
         }
    }

}
