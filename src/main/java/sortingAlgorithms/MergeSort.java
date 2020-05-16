package sortingAlgorithms;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MergeSort extends SortingClass {

    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array,0,copiedArray,0,array.length);

        for (int currentSize = 1; currentSize < array.length; currentSize = 2 * currentSize) {
            for (int startIndex = 0; startIndex <  array.length; startIndex += 2 * currentSize) {

                int midIndex = Math.min(startIndex + currentSize - 1, array.length - 1);

                int endIndex = Math.min(startIndex + 2 * currentSize -1, array.length - 1);

                    merge(copiedArray, startIndex, midIndex, endIndex);

            }
        }

    }

    public static void merge(int[] arrayToMerge, int start, int mid, int end) {

        int currentIndexLeftArray, currentIndexRightArray;
        int indexOfOriginalArray = start;
        int leftArrayLength = mid - start + 1;
        int rightArrayLength = end - mid;

        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (currentIndexLeftArray = 0; currentIndexLeftArray < leftArrayLength; currentIndexLeftArray++){
            leftArray[currentIndexLeftArray] = arrayToMerge[start + currentIndexLeftArray];
        }
        for (currentIndexRightArray = 0; currentIndexRightArray < rightArrayLength; currentIndexRightArray++) {
            rightArray[currentIndexRightArray] = arrayToMerge[mid + 1 + currentIndexRightArray];
        }

        currentIndexLeftArray = 0;
        currentIndexRightArray = 0;

        while (currentIndexLeftArray < leftArrayLength && currentIndexRightArray < rightArrayLength)
        {
            if (leftArray[currentIndexLeftArray] <= rightArray[currentIndexRightArray])
            {
                arrayToMerge[indexOfOriginalArray] = leftArray[currentIndexLeftArray];
                currentIndexLeftArray++;
            }
            else
            {
                arrayToMerge[indexOfOriginalArray] = rightArray[currentIndexRightArray];
                currentIndexRightArray++;
            }
            indexOfOriginalArray++;
        }

        while (currentIndexLeftArray < leftArrayLength)
        {
            arrayToMerge[indexOfOriginalArray] = leftArray[currentIndexLeftArray];
            currentIndexLeftArray++;
            indexOfOriginalArray++;
        }

        while (currentIndexRightArray < rightArrayLength)
        {
            arrayToMerge[indexOfOriginalArray] = rightArray[currentIndexRightArray];
            currentIndexRightArray++;
            indexOfOriginalArray++;
        }
    }
}
