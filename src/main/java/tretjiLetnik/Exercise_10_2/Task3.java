package tretjiLetnik.Exercise_10_2;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr0 = getRandomArr(7, 3);
        int[] arr1 = getRandomArr(10, 4);
        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));
        int[] arrCom = betterCombineSort(arr0, arr1, 1, 3, 1, 3);
        System.out.println(Arrays.toString(arrCom));
    }

    private static int[] getRandomArr(int arrLength, int arrRange) {
        Random randy = new Random();

        int[] arr = new int[arrLength];
        int rand = randy.nextInt(arrRange) + 1;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand;
            rand += randy.nextInt(arrRange) + 1;
        }

        return arr;
    }

    private static int[] betterCombineSort(int[] arrA, int[] arrB, int AIndexFrom, int AIndexTo, int BIndexFrom, int BIndexTo) {
        int[] ret = new int[AIndexTo - AIndexFrom + BIndexTo - BIndexFrom + 2];

        int i = 0;
        for (; AIndexFrom < AIndexTo && BIndexFrom < BIndexTo; i++) {
            if (arrA[AIndexFrom] < arrB[BIndexFrom]) {
                ret[i] = arrA[AIndexFrom];
                System.out.println("a");
                AIndexFrom++;
            } else {
                ret[i] = arrB[BIndexFrom];
                System.out.println("b");
                BIndexFrom++;
            }
        }

        if (arrA.length <= AIndexFrom) {
            while (BIndexFrom < arrB.length) {
                ret[i] = arrB[BIndexFrom];
                BIndexFrom++;
                i++;
            }
        } else {
            while (AIndexFrom < arrA.length) {
                ret[i] = arrA[AIndexFrom];
                AIndexFrom++;
                i++;
            }
        }

        return ret;
    }
}
