import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.SelectionSort;
import sortingAlgorithms.SortingClass;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        int[] intArray = new int[40000];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(intArray.length);
        }

        startNewThread(intArray, bubbleSort);
        startNewThread(intArray, selectionSort);


    }

    public static void startNewThread(int[] array, SortingClass sortingClass) {
        new Thread(() -> {
            int[] tempArray = array;
            LocalTime start = LocalTime.now();
            sortingClass.sort(tempArray);
            LocalTime end = LocalTime.now();
            System.out.println(start.until(end, ChronoUnit.MILLIS) + "ms " + sortingClass.getClass().getSimpleName() + ", " + tempArray.length + " elements.");
        }).start();
    }
}
