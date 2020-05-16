package sortingAlgorithms;

public class InsertionSort extends SortingClass{

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);
        int temp;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < copiedArray.length; firstUnsortedIndex++) {
            temp = copiedArray[firstUnsortedIndex];
            int currentIndex;
            for (currentIndex = firstUnsortedIndex; currentIndex > 0 && copiedArray[currentIndex - 1] > temp; currentIndex--) {
                copiedArray[currentIndex] = copiedArray[currentIndex - 1];
            }
            copiedArray[currentIndex] = temp;
        }
    }
}
