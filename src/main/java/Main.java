import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[25000];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(intArray.length);
        }

        new Thread(() -> {
            int[] tempArray = intArray;
            LocalTime start = LocalTime.now();
            BubbleSort.sort(tempArray);
            LocalTime end = LocalTime.now();
            System.out.println(start.until(end, ChronoUnit.MILLIS) + "ms Bubblesort, " + tempArray.length + " elements.");
        }).start();
    }
}
