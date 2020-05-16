package sortingAlgorithms;

public class ShellSort extends SortingClass {

    public ShellSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);
        for (int gap = copiedArray.length / 2; gap > 0; gap /= 2) {

            for (int sortingIndex = gap; sortingIndex < copiedArray.length; sortingIndex++) {
                int newElement = copiedArray[sortingIndex];

                int currentIndex = sortingIndex;

                while (currentIndex >= gap && copiedArray[currentIndex - gap] > newElement) {
                    copiedArray[currentIndex] = copiedArray[currentIndex - gap];
                    currentIndex -= gap;
                }
                copiedArray[currentIndex] = newElement;
            }
        }
    }

}
