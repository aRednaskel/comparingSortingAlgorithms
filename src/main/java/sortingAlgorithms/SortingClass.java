package sortingAlgorithms;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class SortingClass extends Thread {

    private int[] intArray;

    public SortingClass(int[] array) {
        Counter.count++;
        this.intArray = array;
    }

    public abstract void sort(int[] array);

    @Override
    public void run() {
        LocalTime start = LocalTime.now();
        sort(intArray);
        LocalTime end = LocalTime.now();
        System.out.println("Position " + (Counter.count + 3 - Thread.activeCount()) + "\n"
            + start.until(end, ChronoUnit.MILLIS) + "ms " + this.getClass().getSimpleName()
                + ", " + intArray.length + " elements.");
    }

}
