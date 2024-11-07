package cetrtiLetnik.Exercise_2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(napolniEna(new int[5 * 5])));
    }

    private static int[] napolniEna(int[] ints) {
        return napolniEna(ints, 0);
    }

    private static int[] napolniEna(int[] ints, int i) {
        if (ints.length - 1 == i) {
            ints[ints.length - 1] = 1;
            return ints;
        }
        ints[i] = 1;
        return napolniEna(ints, ++i);
    }
}
