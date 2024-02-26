package Exercise_14;

import java.util.Arrays;
import java.util.Random;

public class Task8 extends Task6 {
    @Override
    public void mainFunc() {
        Random randy = new Random();
        int[] arr = new int[N];
        Arrays.setAll(arr, e -> randy.nextInt(30));
        System.out.println(Arrays.toString(arr));

        int index9 = has9(arr);
        int index18 = has18(arr);

        if (index9 != -1 && index18 != -1) {
            if (index9 < index18) {
                if (index9 != arr.length - 1) {
                    Arrays.sort(arr, ++index9, index18);
                } else {
                    Arrays.sort(arr, index9, index18);
                }
            } else {
                if (index18 != arr.length - 1) {
                    Arrays.sort(arr, ++index18, index9);
                } else {
                    Arrays.sort(arr, index18, index9);
                }
            }
        } else if (index9 == -1 && index18 != -1) {
            if (index18 != arr.length - 1) {
                Arrays.sort(arr, ++index18, arr.length);
            } else {
                Arrays.sort(arr, index18, arr.length);
            }
        } else if (index9 != -1) {
            if (index9 != arr.length - 1) {
                Arrays.sort(arr, ++index9, arr.length);
            } else {
                Arrays.sort(arr, index9, arr.length);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public int has9(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) return i;
        }
        return -1;
    }
    public int has18(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 18) return i;
        }
        return -1;
    }
}
