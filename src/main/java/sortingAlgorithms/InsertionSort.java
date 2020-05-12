package sortingAlgorithms;

public class InsertionSort implements SortingClass{

    @Override
    public void sort(int[] array) {
        int temp;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            temp = array[firstUnsortedIndex];
            int currentIndex;
            for (currentIndex = firstUnsortedIndex; currentIndex > 0 && array[currentIndex - 1] > temp; currentIndex--) {
                array[currentIndex] = array[currentIndex - 1];
            }
            array[currentIndex] = temp;
        }
    }
}
