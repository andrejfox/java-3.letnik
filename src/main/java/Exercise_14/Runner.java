package Exercise_14;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Task2 magic = new Task2();

        magic.generateRandomArray(10, 20);
        System.out.println(Arrays.toString(magic.array));

        magic.insertionSort();
        System.out.println(Arrays.toString(magic.array));
        System.out.println(magic.compareCounter);
    }
}
