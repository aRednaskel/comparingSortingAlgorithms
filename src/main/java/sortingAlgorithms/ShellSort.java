package sortingAlgorithms;

public class ShellSort implements SortingClass {

    public ShellSort() {
        Counter.count++;
    }

    @Override
    public void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int sortingIndex = gap; sortingIndex < array.length; sortingIndex++) {
                int newElement = array[sortingIndex];

                int currentIndex = sortingIndex;

                while (currentIndex >= gap && array[currentIndex - gap] > newElement) {
                    array[currentIndex] = array[currentIndex - gap];
                    currentIndex -= gap;
                }
                array[currentIndex] = newElement;
            }
        }
    }
}
