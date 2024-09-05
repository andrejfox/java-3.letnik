package prviLetnik.Exercise_14;

import java.util.Random;

public class Task1 {
    int[] array = {3, 2, 1};
    public void generateRandomArray(int length, int maxBound) {
        Random randy = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) arr[i] = randy.nextInt(maxBound);
        array = arr;
    }
    public void generateRandomArray(int length, int minBound, int maxBound) {
        Random randy = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) arr[i] = randy.nextInt(maxBound - minBound) + minBound;
        array = arr;
    }
    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];
            int beforeTarget = i - 1;
            while (beforeTarget >= 0 && array[beforeTarget] > target) {
                array[beforeTarget + 1] = array[beforeTarget];
                beforeTarget--;
            }
            array[beforeTarget + 1] = target;
        }
    }
    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int targetIndex = i + 1; targetIndex < array.length; targetIndex++) {
                if (array[targetIndex] < array[minIndex]) minIndex = targetIndex;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public void bubbleSortBrezMeje() {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public void bubbleSort() {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public void bubbleSortSortedCheck() {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
            }
        }
        if (sorted){
            System.out.println("Array is sorted!");
            return;
        }

        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
