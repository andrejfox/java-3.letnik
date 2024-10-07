package tretjiLetnik.Exercise_16;

import java.util.ArrayList;

public class Task6 {
    private int[][] arr;

    public Task6 (int[][] arr) {
        this.arr = arr;
    }

    public int smallestInt() {
        int smallest = arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] < smallest) {
                    smallest = ints[j];
                }
            }
        }
        return smallest;
    }

    public ArrayList<Integer> rowWithSmallestInt() {
        int smallestInt = smallestInt();
        ArrayList<Integer> list = new ArrayList<>();
        out : for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == smallestInt) {
                    list.add(i);
                    continue out;
                }
            }
        }
        return list;
    }

    public ArrayList<Integer> columWithSmallestInt() {
        int smallestInt = smallestInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == smallestInt) {
                    list.add(j);
                }
            }
        }
        return list;
    }
}
