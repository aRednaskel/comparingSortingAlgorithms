package sortingAlgorithms;

public class SelectionSort implements SortingClass {

    public SelectionSort() {
        Counter.count++;
    }

    @Override
    public void sort(int[] array) {
        int temp;
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexWithLargestValue = 0;
            for (int currentIndex = 1; currentIndex <= lastUnsortedIndex; currentIndex++) {
                if (array[currentIndex] > array[indexWithLargestValue]) {
                    indexWithLargestValue = currentIndex;
                }
            }
            if (indexWithLargestValue == lastUnsortedIndex) {
                continue;
            }
            temp = array[indexWithLargestValue];
            array[indexWithLargestValue] = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = temp;
        }
    }
}
