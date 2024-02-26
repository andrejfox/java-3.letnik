package Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task3 extends Task2 {
    int[] arrayUns = {3, 2, 1};
    int swapCounter = 0;
    public void arrayPrint() {
        System.out.println(Arrays.toString(array));
    }
    public void resetCounters() {
        swapCounter = 0;
        compareCounter = 0;
    }

    public void reverseSort() {
        Arrays.sort(array);
        reverse(array);
    }
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swapping elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Moving towards the center
            left++;
            right--;
        }
    }
    @Override
    public void generateRandomArray(int length, int maxBound) {
        Random randy = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) arr[i] = randy.nextInt(maxBound);
        array = arr;
        arrayUns = arr.clone();
    }
    @Override
    public void generateRandomArray(int length, int minBound, int maxBound) {
        Random randy = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) arr[i] = randy.nextInt(maxBound - minBound) + minBound;
        array = arr;
        arrayUns = arr.clone();
    }
    public void unsort() {
        array = arrayUns.clone();
    }
    @Override
    public void insertionSort() {
        boolean valCheck = false;
        for (int i = 1; i < array.length; i++) {
            int target = array[i];
            int beforeTarget = i - 1;
            compareCounter++;
            while (beforeTarget >= 0 && array[beforeTarget] > target) {
                array[beforeTarget + 1] = array[beforeTarget];
                compareCounter++;
                valCheck = true;
                swapCounter++;
                beforeTarget--;
            }
            if (valCheck) {
                compareCounter--;
                valCheck = false;
            }

            array[beforeTarget + 1] = target;
        }
    }
    @Override
    public void selectionSort() {
        boolean valCheck = false;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            compareCounter++;
            for (int targetIndex = i + 1; targetIndex < array.length; targetIndex++) {
                if (array[targetIndex] < array[minIndex]) minIndex = targetIndex;
                compareCounter++;
                valCheck = true;
            }
            if (valCheck) {
                compareCounter--;
                valCheck = false;
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            swapCounter++;
        }
    }
    @Override
    public void bubbleSortBrezMeje() {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                compareCounter++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCounter++;
                }
            }
            if (!swapped) break;
        }
    }
    @Override
    public void bubbleSort() {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                compareCounter++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCounter++;
                }
            }
            if (!swapped) break;
        }
    }
    @Override
    public void bubbleSortSortedCheck() {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            compareCounter++;
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) return;

        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                compareCounter++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCounter++;
                }
            }
            if (!swapped) break;
        }
    }
}
