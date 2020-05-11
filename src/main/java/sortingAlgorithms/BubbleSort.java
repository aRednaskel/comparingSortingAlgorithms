package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort implements SortingClass{

    @Override
    public void sort(int[] array) {
        int temp;
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {
                if (array[currentIndex] > array[currentIndex + 1]) {
                    temp = array[currentIndex];
                    array[currentIndex] = array[currentIndex+1];
                    array[currentIndex+1] = temp;
                }
            }
        }
//        Arrays.stream(array).forEach(System.out::println);
    }
}
