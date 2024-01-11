package Exercise_10;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = generateSequence(10);
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    public static Integer[] generateSequence(int arrLength) {
        Integer[] arr = new Integer[arrLength];
        arr[0] = 5;
        arr[1] = 10;

        for (int i = 2; i < arrLength; i++) {
            arr[i] = arr[i - 2] + arr[i - 1] * 2;
        }

        return arr;
    }
}
