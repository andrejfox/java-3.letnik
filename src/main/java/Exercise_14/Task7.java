package Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task7 extends Task6 {
    @Override
    public void mainFunc() {
        Random randy = new Random();
        int[] arr = new int[N];
        Arrays.setAll(arr, e -> randy.nextInt(10));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, arr.length / 3, arr.length / 3 * 2);
        System.out.println(Arrays.toString(arr));
    }
}
