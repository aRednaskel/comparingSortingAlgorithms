import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {
                if (array[currentIndex] > array[currentIndex + 1]) {
                    int temp = array[currentIndex];
                    array[currentIndex] = array[currentIndex+1];
                    array[currentIndex+1] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
