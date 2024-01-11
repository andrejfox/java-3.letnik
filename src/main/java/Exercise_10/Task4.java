package Exercise_10;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random randi = new Random();
        final int arrSize = 8;
        char[] arr = new char[arrSize];

        for (int i = 0; i < arrSize; i++) {
            if (i % 2 == 1) arr[i] = "aeiou".charAt(randi.nextInt(5));
            else arr[i] = "bcdfghjklmnprstvz".charAt(randi.nextInt(17));
        }

        System.out.println(arr);
    }
}
