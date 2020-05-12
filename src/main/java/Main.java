import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.SelectionSort;
import sortingAlgorithms.SortingClass;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        int position = 3 + 2;
        int[] intArray = new int[40000];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(intArray.length);
        }

        startNewThread(intArray, selectionSort, position);
        startNewThread(intArray, bubbleSort, position);
        startNewThread(intArray, insertionSort, position);


    }

    public static void startNewThread(int[] array, SortingClass sortingClass, int position) {
        new Thread(() -> {
            int[] tempArray = array;
            LocalTime start = LocalTime.now();
            sortingClass.sort(tempArray);
            LocalTime end = LocalTime.now();
            System.out.println("Position " + (position - Thread.activeCount() + 1));
            System.out.println(start.until(end, ChronoUnit.MILLIS) + "ms " + sortingClass.getClass().getSimpleName() + ", " + tempArray.length + " elements.");
        }).start();
    }
}
