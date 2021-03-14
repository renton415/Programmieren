package de.dhbwka.java.exercise.methods;

public class Quicksort {

    public static void quicksort(int[] daten, int left, int right) {
        if (left < right) {
            int teiler = teile(daten, left, right);
            quicksort(daten, left, teiler-1);
            quicksort(daten, teiler+1, right);
        }
    }

    public static int teile(int[] daten, int links, int rechts) {
        int i = links;
        int j = rechts - 1;

        int pivot = daten[rechts];
        do {
            while (daten[i] <= pivot && i < rechts){
                i++;
            }
    
            while (daten[j] >= pivot && j > links){
                j--;
            } 
            if (i<j){
                int temp = daten[i];
                daten[i] = daten[j];
                daten[j] = temp;
            }
        } while (i<j);

        if (daten[i] > pivot) {
            int temp = daten[i];
            daten[i] = daten [rechts];
            daten[rechts] = temp;
        }
        return i;
    }
    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        System.out.println("Unsortierte Zahlenfolge:");
        int[] array = {9, 2, 5, 7, 8, 3, 4, 10, 1, 6};

        sort(array);
        System.out.println("Sortierte Zahlenfolge:");
        for (int i = 0; i<10;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
