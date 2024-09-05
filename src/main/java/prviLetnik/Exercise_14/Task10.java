package prviLetnik.Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task10 extends Task6 {
    @Override
    public void mainFunc() {
        Random randy = new Random();
        int[] arr = new int[N];
        Arrays.setAll(arr, e -> randy.nextInt(30));
        System.out.println(Arrays.toString(arr));

        susySort(arr, 6, 15);
        System.out.println(Arrays.toString(arr));
    }
    public void susySort(int[] arr, int from, int to) {
        Arrays.sort(arr);

        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= from) {
                startIndex = i;
                break;
            }
        }

        int endIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == to) {
                if (i != arr.length - 1 && arr[i + 1] == to) continue;
                endIndex = i + 1;
                break;
            } else if (arr[i] > to) {
                if (i != arr.length - 1) endIndex = i;
                else endIndex = i;
                break;
            }
        }

        if (startIndex < 0 || endIndex < 0) {
            System.out.println("Array doesn't contain both " + from + " and " + to);
        }

        int[] tempArr = Arrays.copyOfRange(arr, startIndex, endIndex);
        reverse(tempArr);
        System.arraycopy(tempArr, 0, arr, startIndex, tempArr.length);
    }
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
