package tretjiLetnik.Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    int N = 5;
    public void mainFunc() {
        Random randy = new Random();
        int[] arr = new int[N];
        Arrays.setAll(arr, e -> randy.nextInt(10));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
