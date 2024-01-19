package Exercise_10_2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static Random randy = new Random();
    public static void main(String[] args) {
        int[] arrCom = getRandomArr(randy.nextInt(10) + 10, 6);
        int[][] sepArr = seperateArr(arrCom);
        System.out.println(Arrays.toString(arrCom));
        System.out.println(Arrays.toString(sepArr[0]));
        System.out.println(Arrays.toString(sepArr[1]));
    }

    private static int[] getRandomArr(int arrLength, int arrRange) {
        int[] arr = new int[arrLength];
        int rand = randy.nextInt(arrRange) + 1;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand;
            rand = randy.nextInt(arrRange) + 1;
        }

        return arr;
    }

    private static int[][] seperateArr(int[] arr) {
        int arrSize0 = arr.length % 2 == 0 ? arr.length / 2 : (arr.length / 2) + 1;
        int arrSize1 = arr.length / 2;

        int[][] ret = new int[2][];
        ret[0] = new int[arrSize0];
        ret[1] = new int[arrSize1];

        int arrCount0 = 0, arrCount1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                ret[0][arrCount0] = arr[i];
                arrCount0++;
            } else {
                ret[1][arrCount1] = arr[i];
                arrCount1++;
            }
        }

        return ret;
    }
}
