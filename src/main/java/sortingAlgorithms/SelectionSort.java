package sortingAlgorithms;

public class SelectionSort extends SortingClass {

    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);
        int temp;
        for (int lastUnsortedIndex = copiedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexWithLargestValue = 0;
            for (int currentIndex = 1; currentIndex <= lastUnsortedIndex; currentIndex++) {
                if (copiedArray[currentIndex] > copiedArray[indexWithLargestValue]) {
                    indexWithLargestValue = currentIndex;
                }
            }
            if (indexWithLargestValue == lastUnsortedIndex) {
                continue;
            }
            temp = copiedArray[indexWithLargestValue];
            copiedArray[indexWithLargestValue] = copiedArray[lastUnsortedIndex];
            copiedArray[lastUnsortedIndex] = temp;
        }
    }
}
