package tretjiLetnik.Exercise_14;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        char[] arr0 = new char[100];
        Arrays.fill(arr0, 'A');

        float[] arr1 = new float[100];
        Arrays.fill(arr1, 12.3F);

        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        Arrays.fill(arr2, 10);
        Arrays.fill(arr3, 11);
        //System.out.println(Arrays.equals(arr2, arr3));

        int[] arr4 = new int[10];
        int[] arr5 = new int[12];
        Arrays.fill(arr4, 11);
        Arrays.fill(arr5, 11);
        //System.out.println(Arrays.equals(arr4, arr5));

        int[] arr6 = new int[10];
        int[] arr7 = new int[10];
        Arrays.fill(arr6, 11);
        Arrays.fill(arr7, 11);
        System.out.println(Arrays.equals(arr6, arr7));

        int[] arr8 = new int[10];
        Arrays.setAll(arr8, e -> (int) (Math.random() * 6));
        int[] arr9 = Arrays.copyOf(arr8, arr8.length);
        int[] arr10 = Arrays.copyOfRange(arr8, 0, arr9.length - 2);
        int[] arr11 = Arrays.copyOf(arr10, arr10.length + 5);

    }
}
