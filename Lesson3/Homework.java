package Lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Homework {

    public static void main(String[] args) {

        Notebook note1 = new Notebook(10, 20);
        Notebook note2 = new Notebook(10, 30);
        Notebook note3 = new Notebook(20, 20);
        Notebook note4 = new Notebook(10, 40);
        Notebook note5 = new Notebook(30, 50);
        Notebook note6 = new Notebook(40, 20);
        Notebook note7 = new Notebook(30, 20);

       ArrayList<Notebook> notes = new ArrayList<>(List.of(note1, note2, note3, note4, note5, note6, note7));

        Comparator<Notebook> noteRamComparator = new Comparator<Notebook>() {

            @Override
            public int compare(Notebook arg0, Notebook arg1) {
                if (arg0.getRam() > arg1.getRam()){
                    return 1;}
                    else if (arg0.getRam() < arg1.getRam()){
                        return -1;
                    }
                                return 0;
            }
        };
        Collections.sort(notes, noteRamComparator);
        for (Notebook note : notes) {
            System.out.println(note.getRam());
        }

        Comparator<Notebook> notePriceComparator = new Comparator<Notebook>() {

            @Override
            public int compare(Notebook arg0, Notebook arg1) {
                if (arg0.getPrice() > arg1.getPrice()){
                    return 1;}
                    else if (arg0.getPrice() < arg1.getPrice()){
                        return -1;
                    }
                                return 0;
            }
        };
        Collections.sort(notes, noteRamComparator);
        for (Notebook note : notes) {
            System.out.println(note.getPrice());
        }
        

        int[] source = {1, 2, 3, 4, 5, 6, 7};
        Iterator<Integer> intArrayIterator = new IntArrayIterator(source);
        while (intArrayIterator.hasNext()) {
            System.out.println(intArrayIterator.next());
        }
    }
    
    private static class Notebook {
    
        private final int ram;
        private final double price;
    
        public Notebook(int ram, double price) {
            this.ram = ram;
            this.price = price;
        }
    
        public int getRam() {
            return ram;
        }
    
        public double getPrice() {
            return price;
        }
    }
    
    private static class IntArrayIterator implements Iterator<Integer> {
    
        private final int[] source;
        int cursor = 0;
    
        public IntArrayIterator(int[] source) {
            this.source = source;
        }
    
        @Override
        public boolean hasNext() {
            
            return cursor <= source.length - 1;
        }
    
        @Override
        public Integer next() {
            int nextInt = source[cursor];
            cursor++;
            return nextInt;
        }
    }
    
    }