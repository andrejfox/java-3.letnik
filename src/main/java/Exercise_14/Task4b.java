package Exercise_14;

public class Task4b {
    public static void main(String[] args) {
        Task3 magic = new Task3();

        magic.generateRandomArray(30, 20);

        magic.bubbleSort();

        System.out.println("         sort          | com | swa ");
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.insertionSort();
        System.out.printf("     insertionSort     | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.selectionSort();
        System.out.printf("     selectionSort     | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.bubbleSortBrezMeje();
        System.out.printf("  bubbleSortBrezMeje   | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.bubbleSort();
        System.out.printf("       bubbleSort      | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.bubbleSortSortedCheck();
        System.out.printf(" bubbleSortSortedCheck | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        System.out.println();

        magic.arrayPrint();
        magic.arrayPrint();
    }
}
