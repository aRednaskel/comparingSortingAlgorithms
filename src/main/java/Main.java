import sortingAlgorithms.*;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        ShellSort shellSort = new ShellSort();
        int instancesNumberPlusThree = Counter.count + 3;
        int[] intArray = new int[40000];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(intArray.length);
        }

        startNewThread(intArray, selectionSort, instancesNumberPlusThree);
        startNewThread(intArray, bubbleSort, instancesNumberPlusThree);
        startNewThread(intArray, shellSort, instancesNumberPlusThree);
        startNewThread(intArray, insertionSort, instancesNumberPlusThree);


    }

    public static void startNewThread(int[] array, SortingClass sortingClass, int position) {
        new Thread(() -> {
            int[] tempArray = array;
            LocalTime start = LocalTime.now();
            sortingClass.sort(tempArray);
            LocalTime end = LocalTime.now();
            System.out.println("Position " + (position - Thread.activeCount()));
            System.out.println(start.until(end, ChronoUnit.MILLIS) + "ms " + sortingClass.getClass().getSimpleName() + ", " + tempArray.length + " elements.");
        }).start();
    }
}
