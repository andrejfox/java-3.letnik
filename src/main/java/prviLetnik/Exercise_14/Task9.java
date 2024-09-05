package prviLetnik.Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task9 extends Task6 {
    @Override
    public void mainFunc() {
        Random randy = new Random();
        int[] arr = new int[N];
        Arrays.setAll(arr, e -> randy.nextInt(30));
        System.out.println(Arrays.toString(arr));

        peaceSort(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public void peaceSort(int[] arr, int peaceSize) {
        for (int i = 0; i < arr.length; i += peaceSize) {
            if (!(i + peaceSize > arr.length)) {
                Arrays.sort(arr, i, i + peaceSize);
            } else {
                Arrays.sort(arr, i, arr.length);
            }

        }
    }
}
