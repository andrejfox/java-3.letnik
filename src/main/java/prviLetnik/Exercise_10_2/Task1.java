package prviLetnik.Exercise_10_2;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr0 = getRandomArr(7, 3);
        int[] arr1 = getRandomArr(10, 4);
        int[] arrCom = combineSort(arr0, arr1);
        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));
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

    private static int[] combineSort(int[] arrA, int[] arrB) {
        int[] ret = new int[arrA.length + arrB.length];

        int pointerA = 0, pointerB = 0, i = 0;
        for (; pointerA < arrA.length && pointerB < arrB.length; i++) {
            if (arrA[pointerA] < arrB[pointerB]) {
                ret[i] = arrA[pointerA];
                pointerA++;
            } else {
                ret[i] = arrB[pointerB];
                pointerB++;
            }
        }

        if (arrA.length <= pointerA) {
            while (pointerB < arrB.length) {
                ret[i] = arrB[pointerB];
                pointerB++;
                i++;
            }
        } else {
            while (pointerA < arrA.length) {
                ret[i] = arrA[pointerA];
                pointerA++;
                i++;
            }
        }

        return ret;
    }
}
