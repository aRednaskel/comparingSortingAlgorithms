import sortingAlgorithms.*;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        int[] intArray = new int[40000];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(intArray.length);
        }

        BubbleSort bubbleSort = new BubbleSort(intArray);
        SelectionSort selectionSort = new SelectionSort(intArray);
        InsertionSort insertionSort = new InsertionSort(intArray);
        ShellSort shellSort = new ShellSort(intArray);
        MergeSort mergeSort = new MergeSort(intArray);

        LocalTime start = LocalTime.now();

        mergeSort.start();
        bubbleSort.start();
        selectionSort.start();
        insertionSort.start();
        shellSort.start();

        bubbleSort.join();
        selectionSort.join();
        shellSort.join();
        insertionSort.join();
        mergeSort.join();

        LocalTime end = LocalTime.now();

        System.out.println("Time: " + start.until(end, ChronoUnit.MILLIS) + " ms");

    }
}
