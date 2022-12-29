package Lesson6;
import java.util.Random;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = new int[1000];
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            Random ran = new Random();
            arr[i] = ran.nextInt(24);

        }
        TreeSet<Integer> arrTree = new TreeSet<>();
        for(int i = 0; i < arr.length; i ++){
            arrTree.add(arr[i]);
        }

        int arrHashLength = arrTree.size();
        System.out.println(arrLength);
        System.out.println(arrHashLength);
        int result = arrHashLength * 100/ arrLength;

        System.out.println("процент уникальных чисел в массиве " + result + "%");
    }
}