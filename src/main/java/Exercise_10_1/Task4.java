package Exercise_10_1;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random randy = new Random();
        final int arrSize = 8;
        char[] arr = new char[arrSize];

        for (int i = 0; i < arrSize; i++) {
            if (i % 2 == 1) arr[i] = "aeiou".charAt(randy.nextInt(5));
            else arr[i] = "bcdfghjklmnprstvz".charAt(randy.nextInt(17));
        }

        System.out.println(arr);
    }
}
