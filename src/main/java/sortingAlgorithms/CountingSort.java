package sortingAlgorithms;

public class CountingSort extends SortingClass {

    private int min = 0;
    private int max;

    public CountingSort(int[] array, int max) {
        super(array);
        this.max = max;
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);
        int[] countArray = new int[(max - min) + 1];

        for (int value : copiedArray) {
            countArray[value - min]++;
        }

        int countOfANumber = 0;
        for (int currentIndexAndValue = min; currentIndexAndValue <= max; currentIndexAndValue++) {
            while (countArray[currentIndexAndValue - min] > 0) {
                copiedArray[countOfANumber++] = currentIndexAndValue;
                countArray[currentIndexAndValue - min]--;
            }
        }
    }
}
