package sortingAlgorithms;

public class BubbleSort extends SortingClass{

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);
        int temp;
        for (int lastUnsortedIndex = copiedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {
                if (copiedArray[currentIndex] > copiedArray[currentIndex + 1]) {
                    temp = copiedArray[currentIndex];
                    copiedArray[currentIndex] = copiedArray[currentIndex+1];
                    copiedArray[currentIndex+1] = temp;
                }
            }
        }
    }
}
