package tretjiLetnik.Exercise_13;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    static int dolzinaTabele = 200000;
    static int[] targets = {88, 0, 56781, 5555};
    public static void main(String[] args) {
        int[] arr = generirajUrejenoTabelo(dolzinaTabele);

        for (int target : targets) {
            int index = Arrays.binarySearch(arr, target);

            if (index < 0){
                System.out.println(target + " not in arr");
            } else {
                System.out.println(target + " in arr on index: " + index);
            }
        }
    }
    public static int[] generirajUrejenoTabelo(int length) {
        Random randy = new Random();
        int[] table = new int[length];
        for (int i = 0; i < length; i++) table[i] = randy.nextInt(100000);
        Arrays.sort(table);
        return table;
    }
}
